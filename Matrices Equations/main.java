import java.util.Scanner;

public class main {
    public static void main (String[] args){
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        
        System.out.print ("Digite os valores da matriz 4x4: ");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaMatriz=0, somaAcima=0, menor = matriz[0][0];
        double mediaDiagonal=0, mediaAbaixo=0;

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (i == j){
                    mediaDiagonal += matriz[i][j];
                }
                if (i < j){
                    somaAcima += matriz[i][j];
                }
                if (i > j){
                    mediaAbaixo += matriz[i][j];
                }
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                }

                somaMatriz += matriz[i][j];
            }
        }

        mediaDiagonal /= 4;
        mediaAbaixo /= 6;

        System.out.print ("\nos resultados são:");
        System.out.print ("\nA) " + mediaAbaixo);     
        System.out.print ("\nB) " + somaAcima);
        System.out.print ("\nC) " + mediaDiagonal);
        System.out.print ("\nD) " + menor);
        System.out.print ("\nE) " + somaMatriz + "\n");

        scanner.close();
    }
}
