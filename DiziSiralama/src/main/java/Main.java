//Dizideki elemanları küçükten büyüğe sıralayan program
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanları : ");
        for(int i = 0; i < list.length ; i++){
            System.out.println((i+1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama : ");
        for(int i = 0 ; i < list.length ; i++){
            System.out.print(list[i] + " ");
        }
    }
    
}
