import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double miktar,kdvOran=0.18,kdvOran2=0.08,kdvtutar,kdvlitutar;


        Scanner inp=new Scanner(System.in);
        System.out.println("Fiyat giriniz :");
        miktar=inp.nextInt();




        if (miktar <=1000 ) {
            kdvtutar=miktar*kdvOran;
            kdvlitutar=miktar+kdvtutar;
            System.out.println("Kdvsiz tutar  :"+miktar);
            System.out.println("Kdv oranı  :"+kdvOran);
            System.out.println("Kdv tutar :"+kdvtutar);
            System.out.println("Kdvli tutar :"+kdvlitutar);


        }
        else if(miktar>1000) {
            kdvtutar=miktar*kdvOran2;
            kdvlitutar=miktar+kdvtutar;
            System.out.println("Kdvsiz tutar  :"+miktar);
            System.out.println("Kdv oranı  :"+kdvOran2);
            System.out.println("Kdv tutar :"+kdvtutar);
            System.out.println("Kdvli tutar :"+kdvlitutar);

        }

    }

}
