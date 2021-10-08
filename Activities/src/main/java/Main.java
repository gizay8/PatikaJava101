//Program that recommends activities according to the temperature
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int heat;
		boolean a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Temperature : ");
		heat = input.nextInt();
		a = (heat < 5);
		b = (heat >= 5 && heat < 15);
		c = (heat >=15 && heat < 25);
		// Above 25 degrees is controlled by else
		if (a==true) System.out.println("You can ski.");
		else if (b==true) System.out.println("You can go to the cinema.");
		else if (c==true) System.out.println("You can go on a picnic.");
		else System.out.println("You can go swimming.");
	}
}
