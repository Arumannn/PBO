import java.util.Scanner;

public class DataTypeProb1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Bilangannya :");
        while(input.hasNext()){
            String bilanganString = input.next();
            try {
                long bilangan = Long.parseLong(bilanganString);
                System.out.println(bilangan +" Can be fitted in");
                if (bilangan >= Byte.MIN_VALUE && bilangan <= Byte.MAX_VALUE) {
                    System.out.println("* Byte");
                }
                if (bilangan >= Short.MIN_VALUE && bilangan <= Short.MAX_VALUE){
                    System.out.println("* Short");
                }
                if (bilangan >= Integer.MIN_VALUE && bilangan <= Integer.MAX_VALUE){
                    System.out.println("* Integer");
                }
                if (bilangan >= Long.MIN_VALUE && bilangan <= Long.MAX_VALUE){
                    System.out.println("* Long");
                }
            } catch (Exception e) {
                System.out.println(bilanganString +" Can't be fitted anywhere");
            }
            }
        input.close();
        
        
    }
}
