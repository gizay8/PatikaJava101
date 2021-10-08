//Üç kenar uzunluğunu kullanıcıdan alarak üçgenin alanını hesaplayan program
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int a, b, c;
		double u, alan;
		Scanner inp = new Scanner(System.in);
    
		System.out.print("Birinci kenari giriniz: ");
		a = inp.nextInt();
		System.out.print("Ikinci kenari giriniz: ");
		b = inp.nextInt();
		System.out.print("Ücüncü kenari giriniz: ");
		c = inp.nextInt();
    
		u = (a + b + c)/2;
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Ücgenin alani: " + alan);
	}
}