public class cuboid {
    public static void main(String[] args) {
        double a= 10.;
        double b = 6.5;
        double c = 4.3;

        double surface = 2* ((a*b)+ (a*c)+ (b*c));
        double Volume = a*b*c;
        System.out.println(surface);
        System.out.println(Volume);
    }
}
