import java.util.Scanner;

public class Strings{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.println("Kalimat Pertama :");
        String Kalimat1= Input.nextLine();

        System.out.println("Kalimat Kedua :");
        String Kalimat2= Input.nextLine();
        System.out.println("=====================================================================");
        System.out.println((Kalimat1 + Kalimat2).length());
        if(Kalimat1.compareTo(Kalimat2) > 0){
            System.out.println("Yes");
        }else{
        }   System.out.println("No");
        String FirstLetter1 = Kalimat1.substring(0, 1);
        String FirstLetter2 = Kalimat2.substring(0, 1);
        String FullLetter1 = Kalimat1.substring(1, Kalimat1.length());
        String FullLetter2 = Kalimat2.substring(1, Kalimat2.length());

        String FullKalimat1 = FirstLetter1.toUpperCase() + FullLetter1;
        String FullKalimat2 = FirstLetter2.toUpperCase() + FullLetter2;


        System.out.println(FullKalimat1 + " " + FullKalimat2);
    }

}