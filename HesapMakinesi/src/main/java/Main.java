//Kullanıcın seçtiği işlemleri yapan hesap makinesi
import java.util.Scanner;
public class Main {
    static int plus(int a, int b){
        int result = a + b;
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        return result;
    }
    static void divided(int a, int b){
        if(b == 0) {
            System.out.println("İkinci sayı sıfırdan farklı olmalı");
        }else {
            int result = a / b;
            System.out.println("Bölüm : " + result);
        }
    }
    static int power(int a, int b){
        int result = 1;
        for(int i = 1 ; i <= b ; i++){
            result *=a;
        }
        return result;
    }
    static int mod(int a, int b) {
        return a %  b;
    }
    static void calc(int a, int b){
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while(true){
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();
            if(select == 0) break;
            System.out.print("Birinci sayı : ");
            int a = scan.nextInt();
            System.out.print("İkinci sayı : ");
            int b = scan.nextInt();
            switch(select){
                case 1:
                    System.out.println("Toplam : " + plus(a,b));
                    break;
                case 2:
                    System.out.println("Fark : " + minus(a,b));
                    break;
                case 3:
                    System.out.println("Çarpım : " + times(a,b));
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi : " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");    
            }
        }
    }
    
}
