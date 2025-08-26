public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

    Tester2.main(args);
    }
}

class Tester2 {
    public static void main(String[] args) {
        System.out.println("Tester2 coming.");
        System.out.println("CM_PER_INCH adalah Constants2: " + Constants2.CM_PER_INCH);
    }
}