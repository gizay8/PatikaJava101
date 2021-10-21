import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, kucuk, buyuk, ebob = 1, ekok = 1, k = 1, t = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();
        if(n1 < n2) {
            kucuk = n1;
            buyuk = n2;
        }else {
            kucuk = n2;
            buyuk = n1;
        }
        while(k <= kucuk) {
            if(kucuk % k == 0 && buyuk % k == 0) {
                ebob = k;
            }
            k++;
        }
        while(t <= (kucuk * buyuk)) {
            if(t % kucuk == 0 && t % buyuk == 0) {
                ekok = t;
                break;
            }
            t++;
        }
        System.out.println("Ebob değeri = " + ebob);
        System.out.println("Ekok değeri = " + ekok);
    }
    
}
