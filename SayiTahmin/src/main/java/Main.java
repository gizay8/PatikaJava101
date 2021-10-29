//Programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesi istenilen "Sayı Tahmin Oyunu"
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWinn = false;
        boolean isWrong = false;
        while(right < 5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if(selected < 0 || selected >99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if(!isWrong){
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınızdan düşülecektir.");
                }else{
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5 - (++right)));
                }
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı : " + number);
                isWinn = true;
                break;
            }else{
                System.out.println("Yanlış tahmin yaptınız!");
                if(selected < number) System.out.println("Gizli sayı " + selected + "sayısından büyüktür.");
                else System.out.println("Gizli sayı " + selected + " sayısından küçüktür.");
            }
            wrong[right++] = selected;
            System.out.println("Kalan hakkınız : " + (5 - right));
        }if(!isWinn){
           System.out.println("Kaybettiniz! Doğru tahmin : " + number);
           if(!isWrong){
               System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
           } 
        }
    }   
}
