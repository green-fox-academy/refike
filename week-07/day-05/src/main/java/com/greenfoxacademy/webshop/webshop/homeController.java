package com.greenfoxacademy.webshop.webshop;

import org.apache.logging.log4j.util.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class homeController {
    List<ShopItem> itemsList = new ArrayList<>();


    @PostConstruct
    public void init() {
        itemsList.add(new ShopItem("Running Shoes", "Nike running shoes for men's", 100, 5));
        itemsList.add(new ShopItem("Car", "A fancy red sport car", 10000, 0));
        itemsList.add(new ShopItem("Sword", "A shiny sword, from Camelot", 100, 2));
        itemsList.add(new ShopItem("Tiger", "Baby tiger from Mars", 2300, 4));
        itemsList.add(new ShopItem("Broken shovel", "This shovel is broken..", 2, 3));
        itemsList.add(new ShopItem("Fearless Warrior", "A brave warrior from Sparta", 400, 100));
    }

    @RequestMapping("/home")
    public String getHomeVieW(Model model) {
        model.addAttribute("items", itemsList);
        return "home";
    }

    @GetMapping("/Only-Available")
    public String getAvailable(Model model) {
        model.addAttribute("items", itemsList.stream()
                .filter(shopItem -> shopItem.getQuantity() > 0)
                .collect(Collectors.toList()));
        return "home";

    }

    @GetMapping("/Cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("items", itemsList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList()));
        return "home";

    }

    @GetMapping("/Contains-Nike")
    public String containsNike(Model model) {
        model.addAttribute("items", itemsList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains("nike") || shopItem.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList()));
        return "home";

    }

    @GetMapping("/Average-stock")
    public String getAverageStock(Model model) {
        model.addAttribute("average",itemsList.stream()
                .mapToDouble(ShopItem::getQuantity)
                .average()
                .orElse(0));
        return "averageStock";
        // stream().collect(Collectors.averagingDouble(item -> item.getQuantity()))

    }

    @GetMapping("/Most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("items", itemsList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
                .collect(Collectors.toList()).get(0));
        return "home";
        // stream().max(Comparator.comparing(Item::getPrice)).get().getName();

    }
    @PostMapping("/Search")
    public String searchKeyword(@RequestParam("searching") String item, Model model){
        List<ShopItem> shoppingItemList = itemsList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(item) || shopItem.getDescription().toLowerCase().contains(item))
                .collect(Collectors.toList());
        model.addAttribute("items", shoppingItemList);


        return "home";
    }

}
