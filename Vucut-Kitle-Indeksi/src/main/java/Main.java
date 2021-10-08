//Kullanicidan boy ve kilo degerlerini alarak vücut kitle indeksini hesaplayan program
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		double m, kg, vki;
		Scanner inp = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
		m = inp.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kg = inp.nextDouble();
		vki = kg / (m * m);
		System.out.println("Vücut Kitle Indeksiniz : " + vki);
	}
}
