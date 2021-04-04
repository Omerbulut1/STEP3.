package STEP3;
import java.util.Scanner;
public class A3_While_Avarage {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sayi, toplam=0, count=0;
        double ortalama;
        while(count<5){
            System.out.println("Sayiyi giriniz");
            sayi=input.nextInt();
            toplam+=sayi;
            count++;
        }
        ortalama=toplam/count;
        System.out.println("ortalama="+ortalama);





    }
}
