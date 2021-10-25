//Taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan program
import java.util.Scanner;

public class Main {

    static int recPower(int x, int y) {
        if (x == 1){
            return 1;
        }
        else if (y == 0){
            return 1;
        }
        else {
            return x * recPower(x, y - 1);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Base of Number:");
        int base = s.nextInt();
        System.out.print("Enter the Power of Number:");
        int power = s.nextInt();
        System.out.println("Result:" + recPower(base, power));
    }

}