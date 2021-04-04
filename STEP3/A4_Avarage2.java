package STEP3;
import java.util.Scanner;
public class A4_Avarage2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sayi, count=0, toplam=0;
        double avarage;

        System.out.println("sayi giriniz");
        sayi=input.nextInt();

        while (sayi!=-1){

            toplam+=sayi;

            if (sayi!=-1) {
            }

            System.out.println("sayi giriniz");
            sayi = input.nextInt();
            count++;

        }
        avarage=toplam/count;
        System.out.println("ortalama="+ avarage);

    }





}
