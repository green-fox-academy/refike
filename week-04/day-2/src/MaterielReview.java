public class MaterielReview {
    public static void main(String[] args) {

        // inheritance
        // encapsulation
        // polymorphism
        // abstraction

        int [] numbers = {1,2,3};
        FamilyMember mom = new FamilyMember();
        FamilyMember dad = new FamilyMember();
        mom.age = 30;
        System.out.println(mom.age);
        System.out.println(dad.age);
        System.out.println(dad.name);
        System.out.println(mom.name);
    }

    public static void doubleValues (int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            nums[i] *= 2;
        }
    }
}
