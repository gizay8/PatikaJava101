//Bir sayının basamak sayılarının toplamını hesaplayan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int basamak = 0, toplam = 0;
		System.out.print("Sayi : ");
		int sayi = scan.nextInt();
		int sayi1 = sayi;
		int sayi2 = sayi;
		while (sayi1 != 0) {
		    sayi1 /= 10;
		    basamak++;
		}
		for (int i = 1 ; i <= basamak ; i++) {
		    toplam += (sayi2 % 10);
		    sayi2 /= 10;
		}
		System.out.println("Basamak Sayilarinin Toplami = " + toplam);
	}
}