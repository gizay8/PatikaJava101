//Basamak sayısı kullanıcıdan alınan ve yıldızlar ile ters üçgen çizen program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int basamak = input.nextInt();
        for (int i = basamak ; i >= 1 ; i--) {
            for (int k = 1 ; k <= basamak - i ; k++) {
               System.out.print(" ");
           }
            for (int j = 1 ; j <= (2*i) - 1 ; j++) {
               System.out.print("*");
           }System.out.println();
        }
    }
    
}
