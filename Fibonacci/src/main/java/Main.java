//Döngüler ile fibonacci serisi bulan program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Eleman sayısı : ");
        int e = in.nextInt();
        int sol = 0;
        int orta = 1;
        System.out.print(sol + " " + orta + " ");
        for(int i = 2 ; i <= e ; i++) {
            int sag = sol + orta;
            System.out.print(sag + " ");
            sol = orta;
            orta = sag;
        }
    }
    
}
