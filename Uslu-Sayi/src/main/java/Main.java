//Kullanıcının girdiği değerler ile üslü sayı hesaplayan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n, k, result = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Üssü alinacak sayi : ");
		n = input.nextInt();
		System.out.print("Üs olacak sayi : ");
		k = input.nextInt();
		for(int i=1 ; i <= k ; i++) result *= n;
		System.out.println("Cevap : " + result);
	}
}
