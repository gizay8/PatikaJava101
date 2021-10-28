//Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static boolean isFind(int arr[], int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        int[] repeat = new int[duplicate.length];
        Arrays.fill(repeat, 0);
        for(int i = 0 ; i < list.length ; i++){
            for(int j = 0 ; j < list.length ; j++){
                if((list[i] == list[j])){
                    if(!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                }
            }
        }
        for(int i = 0 ; i < duplicate.length ; i++){
            for(int j = 0 ; j < list.length ; j++){
                if(duplicate[i] == list[j]){
                    repeat[i]++;
                }
        }
        }
        for(int i = 0 ; i < duplicate.length ; i++){
            if(duplicate[i] != 0){
               System.out.println(duplicate[i] + " sayısı " + repeat[i] + " kere tekrar edildi."); 
            }
        }   
    }
    
}
