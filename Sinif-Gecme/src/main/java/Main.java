//Kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program (Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmaz)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz : ");
		mat = input.nextInt();
		System.out.print("Fizik notunuz : ");
		fizik = input.nextInt();
		System.out.print("Türkce notunuz : ");
		turkce = input.nextInt();
		System.out.print("Kimya notunuz : ");
		kimya = input.nextInt();
		System.out.print("Müzik notunuz : ");
		muzik = input.nextInt();
		
		int[] dersler = {mat, fizik, turkce, kimya, muzik};
		for (int i=0 ; i<dersler.length ; i++) {
		    if (dersler[i]<0 || dersler[i]>100) dersler[i]=0;
		}
		
		double average = (dersler[0]+dersler[1]+dersler[2]+dersler[3]+dersler[4]) / 5;
		if (average < 55) {
		    System.out.println("Sinifta kaldiniz, seneye tekrar görüsmek üzere!");
		} else {
		    System.out.println("Tebrikler, sinifi gectiniz!");
		}
		System.out.println("Ortalamaniz :" + average);
	}
}
