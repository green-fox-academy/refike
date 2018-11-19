package SharpieSet;

public class Main {
    public static void main(String[] args) {


        Sharpie myRedSharpie = new Sharpie("red", 0.5);
        myRedSharpie.use();
        System.out.println("InkAmount decrease, new amount " + myRedSharpie.inkAmount);

        Sharpie myBlueSharpie = new Sharpie("blue", 1.0);
        SharpieSet mySharpies = new SharpieSet();
        mySharpies.add(myBlueSharpie);
        mySharpies.add(myRedSharpie);
        System.out.println(mySharpies.countUsable());
        myRedSharpie.useALL();
        System.out.println("InkAmount decrease, new amount " + myRedSharpie.inkAmount);
        System.out.println(mySharpies.countUsable());
        mySharpies.remove();
        System.out.println(mySharpies.countUsable());

    }
}
