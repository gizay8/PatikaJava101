//Yilin artik olup olmadigini bulan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int yil;
		double kalan, kalan2, kalan3;
		boolean artikYil;
		Scanner inp = new Scanner(System.in);
		System.out.print("Yil Giriniz : ");
		yil = inp.nextInt();
		kalan = yil % 4;
		kalan2 = yil % 100;
		kalan3 = yil % 400;
		if (kalan == 0) artikYil = true;
		else artikYil = false;
		
		if (kalan2 == 0){
		    if (kalan3 == 0) artikYil = true;
		    else artikYil = false;
		}
		
		if (artikYil) System.out.println(yil + " bir artik yildir !");
		else System.out.println(yil + " bir artik yil degildir !");
	}
}
