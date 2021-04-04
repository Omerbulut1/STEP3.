package STEP3;
import java.util.Scanner;
public class A4_While_Faktoriel {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sayi, count=1, faktoriel=1;
        System.out.println("Sayiyi giriniz");
        sayi=input.nextInt();

        while(count<sayi){
            faktoriel=faktoriel*(count+1);
            count++;
        }
        System.out.println(sayi+ "in Faktoriyeli= " + faktoriel);

    }
}
