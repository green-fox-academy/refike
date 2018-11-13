public class Animal {
    int hunger;
    int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat(){
        hunger--;
    }


    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;

    }

}

class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.drink();
        System.out.println("Now I'm not that hungry, my thirst " + myAnimal.thirst);
        myAnimal.eat();
        System.out.println("Now I'm not that hungry, my hunger " + myAnimal.hunger);
        myAnimal.play();
        System.out.println("This game made me more thirsty and hungry, my hunger " + myAnimal.hunger +
                ", and my thirst " + myAnimal.thirst);
    }
}
