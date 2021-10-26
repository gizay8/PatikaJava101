//Kullanıcıdan alınan n değerine göre kurala uyan döngü kullanmadan bir "Recursive" metot
import java.util.Scanner;
public class Main {
    static void recDesenn(int d, int e) {
        if((d < e) ) {
            System.out.print(d + " ");
            recDesenn((d + 5), e);
            
        }    
    }
    static void recDesen(int a, int c) {
        if((a > 0)&& (c >= a) ) {
            System.out.print(a + " ");
            recDesen((a - 5), c);
        } else recDesenn (a, c);   
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = input.nextInt();
        int c = n;
        System.out.print(n + " ");
        recDesen((n-5), c);
        System.out.print(n + " ");
    }
    
}