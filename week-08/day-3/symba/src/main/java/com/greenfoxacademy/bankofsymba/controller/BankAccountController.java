package com.greenfoxacademy.bankofsymba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    private List<BankAccount> accounts = new ArrayList<>();

    public BankAccountController() {
        accounts.add(new BankAccount("Symba", 2000, "lion", true));
        accounts.add(new BankAccount("Mufasa", 2500, "lion", false));
        accounts.add(new BankAccount("Pumba", 1500, "boar", false));

    }


    @GetMapping("/show")
    public String queryAccount(Model model) {
        model.addAttribute("accounts", accounts);
        return "baseview";
    }

    @GetMapping("/inception")
    public String showInception() {
        return "tempTwo";
    }


    @GetMapping("/account/add")
    public String addAccountForm(Model model, BankAccount account) {
        model.addAttribute("acc", account);
        return "create";
    }


    @PostMapping("/account/add")
    public String addAccount(@ModelAttribute(name = "acc") BankAccount account) {
        accounts.add(account);
        return "redirect:/show";
    }

    @GetMapping("/raise/{name}")
    public String raiseMoney(Model model, @PathVariable(name = "name") String name) {
        for (BankAccount account : accounts) {
            if (account.getName().equals(name) && account.getKing()) {
                account.setBalance(account.getBalance() + 100);
            } else if (account.getName().equals(name)) {
                account.setBalance(account.getBalance() + 10);
            }
        }
        model.addAttribute("accounts", accounts);
        return "baseview";

    }
}