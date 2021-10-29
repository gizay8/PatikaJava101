//Çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan program
public class Main {
    public static void main(String[] args) {
        System.out.println("Matris :");
        int[][] matris = new int[2][3];
        int n = 1;
        for(int i = 0 ; i < matris.length ; i++){
            for(int j = 0 ; j < matris[i].length ; j++){
                matris[i][j] = n;
                n++;
                System.out.print(matris[i][j] + " ");
            }System.out.println();
        }
        System.out.println("Transpoze :");
        int[][] transpoze = new int[3][2];
        for(int i = 0 ; i < transpoze.length ; i++){
            for(int j = 0 ; j < transpoze[i].length ; j++){
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }System.out.println();
        }
    }
    
}
