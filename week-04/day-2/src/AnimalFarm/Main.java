package AnimalFarm;

import AnimalFarm.Animal;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
//        Animal myAnimal = new Animal();
//        myAnimal.drink();
//        System.out.println("Now I'm not that thirsty, my thirst " + myAnimal.thirst);
//        myAnimal.eat();
//        System.out.println("Now I'm not that hungry, my hunger " + myAnimal.hunger);
//        myAnimal.play();
//        System.out.println("This game made me more thirsty and hungry, my hunger " + myAnimal.hunger +
//                ", and my thirst " + myAnimal.thirst);

        Animal tiger = new Animal("tiger");
        tiger.eat();
        tiger.eat();
        tiger.eat();
        System.out.println("Tiger hunger " + tiger.hunger);
        Animal dog = new Animal("dog");
        dog.eat();
        System.out.println("Dog hunger " + dog.hunger);
        Animal cat = new Animal("cat");
        System.out.println("Cat hunger " + cat.hunger);

        Farm farm = new Farm();
        farm.breed(tiger);
        farm.breed(dog);
        farm.breed(cat);

        farm.slaughter();

    }
}