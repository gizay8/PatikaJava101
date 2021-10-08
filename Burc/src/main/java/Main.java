//Dogum tarihine göre burc hesaplayan program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int month, day;
		String zodiacSign = "";
		boolean isError = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dogdugunuz ay : ");
		month = input.nextInt();
		System.out.print("Dogdugunuz gün : ");
		day = input.nextInt();
		
		if (month == 1) {
		    if (day >= 1 && day <= 31) {
		        if (day < 22) zodiacSign = "Oglak";
		        else zodiacSign = "Kova";
		    } else isError = true;
		} else if (month == 2) {
		    if (day >= 1 && day <= 28) {
		        if (day < 20) zodiacSign = "Kova";
		        else zodiacSign = "Balik";
		    } else isError = true;
		} else if (month == 3) {
		    if (day >= 1 && day <= 31) {
		        if (day < 21) zodiacSign = "Balik";
		        else zodiacSign = "Koc";
		    } else isError = true;
		} else if (month == 4) {
		    if (day >= 1 && day <= 30) {
		        if (day < 21) zodiacSign = "Koc";
		        else zodiacSign = "Boga";
		    } else isError = true;
		} else if (month == 5) {
		    if (day >= 1 && day <= 31) {
		        if (day < 22) zodiacSign = "Boga";
		        else zodiacSign = "Ikizler";
		    } else isError = true;
		} else if (month == 6) {
		    if (day >= 1 && day <= 30) {
		        if (day < 23) zodiacSign = "Ikizler";
		        else zodiacSign = "Yengec";
		    } else isError = true;
		} else if (month == 7) {
		    if (day >= 1 && day <= 31) {
		        if (day < 23) zodiacSign = "Yengec";
		        else zodiacSign = "Aslan";
		    } else isError = true;
		} else if (month == 8) {
		    if (day >= 1 && day <= 31) {
		        if (day < 23) zodiacSign = "Aslan";
		        else zodiacSign = "Basak";
		    } else isError = true;
		} else if (month == 9) {
		    if (day >= 1 && day <= 30) {
		        if (day < 23) zodiacSign = "Basak";
		        else zodiacSign = "Terazi";
		    } else isError = true;
		} else if (month == 10) {
		    if (day >= 1 && day <= 31) {
		        if (day < 23) zodiacSign = "Terazi";
		        else zodiacSign = "Akrep";
		    } else isError = true;
		} else if (month == 11) {
		    if (day >= 1 && day <= 30) {
		        if (day < 22) zodiacSign = "Akrep";
		        else zodiacSign = "Yay";
		    } else isError = true;
		} else if (month == 12) {
		    if (day >= 1 && day <= 31) {
		        if (day < 22) zodiacSign = "Yay";
		        else zodiacSign = "Oglak";
		    } else isError = true;
		} else isError = true;
		if (isError) System.out.println("Hatali giris yaptiniz, tekrar deneyiniz!");
		else System.out.println("Burcunuz : " + zodiacSign);
	}
}
