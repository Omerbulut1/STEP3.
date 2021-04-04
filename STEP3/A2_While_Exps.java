package STEP3;
import java.util.Scanner;
public class A2_While_Exps {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sayi1, sayi2, secim, sonuc;
        System.out.println("1-TOPLAMA\n2-CIKARMA\n3-CARPMA\n4-BOLME\n5-CIKIS");
        System.out.println("Yapmak istediginiz islemi seciniz.");
        secim=input.nextInt();
        while(secim<1||secim>5){
            System.out.println("YANLIS SECIM!!!! GECERLI ISLEM KODU GIRINIZ");
            secim=input.nextInt();

        }

        while(secim!=5){
            System.out.println("iki tam sayi giriniz");
            sayi1=input.nextInt();
            sayi2=input.nextInt();
            if(secim==1){
                sonuc=sayi1+sayi2;
            }
            else if (secim==2){
                sonuc=sayi1-sayi2;
            }
            else if (secim==3) {
                sonuc = sayi1 * sayi2;
            }
            else{
                sonuc=sayi1/sayi2;
            }
            System.out.println("isleminizin sonucu="+ sonuc);
            input.nextLine();
            input.nextLine();

            System.out.println("bir islem seciniz");
            System.out.println("1-TOPLAMA\n2-CIKARMA\n3-CARPMA\n4-BOLME\n5-CIKIS");
            secim=input.nextInt();

            while(secim<1|| secim>5){
                System.out.println("YANLIS SECIM!!!! GECERLI ISLEM KODU GIRINIZ");
                secim=input.nextInt();
            }
        }
        System.out.println("hesap makinesi kullandiginiz icin tesekkurler");

    }
}




