//Programm, das Eingaben akzeptiert, bis eine einzelne Zahl eingegeben wird, und Vielfache von vier addiert
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n, summe = 0;
		Scanner scan = new Scanner(System.in);
		do {
		    System.out.print("Nummer eingeben : ");
		    n = scan.nextInt();
		    if (n % 4 == 0) summe += n;
		} while(n % 2 == 0);
		System.out.println("Summe der Zahlen : " + summe);
	}
}
