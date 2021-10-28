//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int n = input.nextInt();
        int[] list = {15, 12, 788, 1, -1 ,-778, 2, 0};
        Arrays.sort(list);
        int small = 0, big = 0;
        for (int i = 0 ; i < list.length ; i++) {
            if(list[i] > n){
                big = list[i];
                break;
            }
        }
        for (int i = (list.length - 1) ; i >= 0 ; i--) {
            if(list[i] < n){
                small = list[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + small);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + big);
    }
    
}
