//Java dilinde Mayın Tarlası oyunu
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        System.out.println("Oyun hangi boyutlarda olsun ? ");
        System.out.print("Satır : ");
        row = scan.nextInt();
        System.out.print("Sütun : ");
        col = scan.nextInt();
        
        MineSweeper game = new MineSweeper(row, col);
        game.run();
    }
    
}
