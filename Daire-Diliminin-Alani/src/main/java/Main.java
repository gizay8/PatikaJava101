//Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int r, 𝛼;
		double pi = 3.14, alan;
		Scanner girdi = new Scanner(System.in);
		System.out.print("Dairenin yaricapini giriniz: ");
		r = girdi.nextInt();
		System.out.print("Merkez acisinin ölcüsünü giriniz: ");
		𝛼 = girdi.nextInt();
		alan = (pi * (r*r) * 𝛼)/360;
		System.out.println("Daire diliminin alani: " + alan);
	} 
}