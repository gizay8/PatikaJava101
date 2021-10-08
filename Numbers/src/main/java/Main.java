//Program that prints powers of 4 and 5 up to the entered number
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		n = input.nextInt();
		System.out.print("Powers of 4 : ");
		for (int i = 0 ; Math.pow(4,i) < n ; i++) {
		    System.out.print(Math.pow(4,i) + "\t");
		}
		System.out.println();
		System.out.print("Powers of 5 : ");
		for (int i = 0 ; Math.pow(5,i) < n ; i++) {
		    System.out.print(Math.pow(5,i) + "\t");
		}
	}
}
