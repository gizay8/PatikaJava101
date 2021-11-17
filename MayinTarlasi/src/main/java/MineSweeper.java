import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean play = true;
   
    
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }
    public void run(){
       int row, col, success = 0;
       preGame();
       //printMap(this.map);
       while(play){
           System.out.println("======================");
           printBoard(this.board);
           System.out.print("Satır Giriniz : ");
           row = scan.nextInt();
           System.out.print("Sütun Giriniz : ");
           col = scan.nextInt();
           if(row > (this.rowNumber - 1) || col > (this.colNumber - 1) || row < 0 || col < 0){  
               System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz !");
               continue;
           }else {
               if(this.map[row][col] != -1){
                   check(row,col);
                   success++;
                   if(success == size - (size / 4)){
                       System.out.println("Oyunu Kazandınız !");
                       break;
                   }  
               }else {
                   play = false;
                   System.out.println("Game Over!!");
               }
           }
           
       }
    }
    public void preGame(){
        int randRow, randCol, count = 0;
        while(count != (size / 4)){
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (map[randRow][randCol] != -1){
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }
    /*public void printMap(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){
                if(array[i][j] == 0) System.out.print("- ");
                else if(array[i][j] == -1) System.out.print("* ");
            }System.out.println();
        }
    }*/
    public void printBoard(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){
                if(array[i][j] == -2) System.out.print("0 ");
                else if(array[i][j] == 0) System.out.print("- ");
                else System.out.print(array[i][j] + " ");
            }System.out.println();
        }
    }
    public void check(int row, int col){
     
            if(row > 0 && col > 0 && map[row - 1][col - 1] == -1){
                this.board[row][col]++;
            }
            if(row > 0 && map[row - 1][col] == -1){
                this.board[row][col]++;
            }
            if(row > 0 && col < (this.colNumber - 1) && map[row - 1][col + 1] == -1){
                this.board[row][col]++;
            }
            if(col > 0 && map[row][col - 1] == -1){
                this.board[row][col]++;
            }
            if(col < (this.colNumber - 1) && map[row][col + 1] == -1){
                this.board[row][col]++;
            }
            if(row < (this.rowNumber - 1) && col > 0 && map[row + 1][col - 1] == -1){
                this.board[row][col]++;
            }
            if(row < (this.rowNumber - 1) && map[row + 1][col] == -1){
                this.board[row][col]++;
            }
            if(row < (this.rowNumber - 1) && col < (this.colNumber - 1) && map[row + 1][col + 1] == -1){
                this.board[row][col]++;
            } 
            if(this.board[row][col] == 0) this.board[row][col] = -2;
    }
}
