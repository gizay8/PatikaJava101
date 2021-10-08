//N’in r’li kombinasyonunu C(n,r) hesaplayan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		long nFaktöriyel = 1, rFaktöriyel = 1, nrFaktöriyel = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Kümenin eleman sayisi : ");
		int n = scan.nextInt();
		System.out.print("Gruplarin eleman sayisi : ");
		int r = scan.nextInt();
		int nr = n - r;
		for(int i=1 ; i <= n ; i++) nFaktöriyel *= i;
		for(int j=1 ; j <= r ; j++) rFaktöriyel *= j;
		for(int k=1 ; k <= nr ; k++) nrFaktöriyel *= k;
		long result = nFaktöriyel / (rFaktöriyel * nrFaktöriyel);
		System.out.println("Kombinasyon = " + result);
	}
}
