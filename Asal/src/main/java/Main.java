//1 - 100 arasındaki asal sayıları ekrana yazdıran program
public class Main {
    public static void main(String[] args) {
        for(int i = 2 ; i <= 100 ; i++) {
            int bolen = 0;
            for(int k = 2 ; k < i ; k++) {
            if(i % k == 0) bolen = 1;
        } if(bolen == 0) System.out.print(i + " ");
        }
    }
    
}
