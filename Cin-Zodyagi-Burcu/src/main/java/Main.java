//Kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int yil;
		String burc = "";
		Scanner inp = new Scanner(System.in);
		System.out.print("Dogum Yilinizi Giriniz : ");
		yil = inp.nextInt();
		int kalan = yil % 12;
		switch (kalan) {
		    case 0 :
		        burc = "Maymun";
		        break;
		    case 1 :
		        burc = "Horoz";
		        break;
		    case 2 :
		        burc = "Köpek";
		        break;
		    case 3 :
		        burc = "Domuz";
		        break;
		    case 4 :
		        burc = "Fare";
		        break;
		    case 5 :
		        burc = "Öküz";
		        break;
		    case 6 :
		        burc = "Kaplan";
		        break;
		    case 7 :
		        burc = "Tavsan";
		        break;
		    case 8 :
		        burc = "Ejderha";
		        break;
		    case 9 :
		        burc = "Yilan";
		        break;
		    case 10 :
		        burc = "At";
		        break;
		    case 11 :
		        burc = "Koyun";
		        break;
		    default :  
		    
		}
		System.out.println("Cin Zodyagi Burcunuz : " + burc);
	}
}