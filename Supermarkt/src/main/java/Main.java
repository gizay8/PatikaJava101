//Das Programm, das den Gesamtpreis im Supermarkt berechnet
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double birne, apfel, tomate, banane, aubergine, gesamtsumme;
		double biProKg = 2.14, ApProKg = 3.67, toProKg = 1.11;
		double baProKg = 0.95, auProKg = 5.00;
		
    Scanner input = new Scanner(System.in);
		
		System.out.print("Wie viele Kilogramm Birnen? :");
		birne = input.nextDouble();
		System.out.print("Wie viele Kilogramm Äpfel? :");
		apfel = input.nextDouble();
		System.out.print("Wie viele Kilogramm Tomaten? :");
		tomate = input.nextDouble();
		System.out.print("Wie viele Kilogramm Bananen? :");
		banane = input.nextDouble();
		System.out.print("Wie viele Kilogramm Auberginen? :");
		aubergine = input.nextDouble();
		
    gesamtsumme=(birne*biProKg)+(apfel*ApProKg)+(tomate*toProKg)+(banane*baProKg)+(aubergine*auProKg);
		System.out.println("Gesamtsumme : " + gesamtsumme);
	}
}
