//"Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan program
import java.util.*;

public class Main {

    static boolean recursivePrime(int x, int i) {
        if(x == 1)
            return false;
        if (x == i)
            return true;
        if (x % i == 0)
            return false;
        return recursivePrime(x, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = scan.nextInt();
        int i = 2;
        System.out.println(recursivePrime(sayi, i) ? "Asal" : "Asal Değil");
    }
}
