//The program that prints the taximeter cost on the screen according to the distance traveled
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int distance, startCost = 10, minCost = 20;
		double perKm = 2.20, cost;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance: ");
		distance = input.nextInt();
		cost = startCost + (distance * perKm);
		cost = (cost>minCost)? cost : minCost;
		System.out.println("It costs: " + cost);
	}
}