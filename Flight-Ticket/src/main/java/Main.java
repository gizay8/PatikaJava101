//Ucak bilet fiyati hesaplayan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int km, yas, tip;
		double normalTutar, yasIndirimi, yasIndirimOrani, indirimliTutar,gidisdönüsBiletInd, toplamTutar;
		boolean isError;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		km = inp.nextInt();
		System.out.print("Yasinizi giriniz : ");
		yas = inp.nextInt();
		System.out.print("Yolculuk tipinizi giriniz (1 => Tek Yön , 2 => Gidis-Dönüs): ");
		tip = inp.nextInt();
		
		normalTutar = km * 0.10;
		if (yas <= 12) yasIndirimOrani = 0.5;
		    else if (yas > 12 && yas <= 24) yasIndirimOrani = 0.1;
		    else if (yas >= 65) yasIndirimOrani = 0.3;
		    else yasIndirimOrani = 0;
		    
		    yasIndirimi = normalTutar * yasIndirimOrani;
		    indirimliTutar = normalTutar - yasIndirimi;
		    
		    if (tip == 2) {
		        gidisdönüsBiletInd = indirimliTutar * 0.2;
		        toplamTutar = indirimliTutar - gidisdönüsBiletInd;
		    } else toplamTutar = indirimliTutar;
		
		if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) isError = false;
	    else isError = true;
		
		if (isError) System.out.println("Hatali Veri Girdiniz !");
		else System.out.println("Toplam Tutar : " + toplamTutar);
	}
}