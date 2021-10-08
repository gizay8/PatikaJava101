//0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int k, toplam = 0, tane = 0;
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayi Giriniz : ");
		k = inp.nextInt();
		
		for (int i = 0 ; i<=k ; i++) {
		    if (i % 3 == 0 && i % 4 == 0) {
		        toplam += i;
		        tane++;
		    }
		}
		System.out.println("Ortalama : " + toplam / tane);
	}
}
