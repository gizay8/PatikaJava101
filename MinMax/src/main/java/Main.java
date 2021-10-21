//N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, ilk, min, max, number;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();
        System.out.print("1. Sayıyı giriniz : ");
        ilk = input.nextInt();
        min = ilk;
        max = ilk;
        for(int i = 2 ; i <= n ; i++) {
            System.out.print(i + ". Sayıyı giriniz : ");
            number = input.nextInt();
            if(number < min) min = number;
            if(number > max) max = number;
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
    
}
