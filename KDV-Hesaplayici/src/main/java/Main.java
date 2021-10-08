/*Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program
(Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplar)*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double ilkTutar,kdvOran, kdvTutar, sonTutar;
        System.out.print("Para degerini giriniz: ");
        Scanner inp = new Scanner(System.in);
        ilkTutar = inp.nextDouble();
        if (ilkTutar<=1000) {
            kdvOran = 0.18;
        }
        else {
            kdvOran = 0.08;
        }
        kdvTutar = ilkTutar * kdvOran;
        sonTutar = ilkTutar + kdvTutar;
        
        System.out.println("KDV orani: " + kdvOran);
        System.out.println("KDV tutari: " + kdvTutar);
        System.out.println("KDV'li fiyat: " + sonTutar);
    }
}
