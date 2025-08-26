public class Constants{
    public static void main(String[] args){
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        Tester1.main(args);
    }
}

class Tester1{
    public static void main(String[] args) {
        System.out.println("This is a tester class.");
        System.out.println(Constants.CM_PER_INCH);
    }

}