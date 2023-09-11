/* Prova 01
    Aluno: João Vitor Cardoso Beltrão – Matricula: 20220006134
*/

import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice, N;

        System.out.println("Digite o tamanho da matriz:");
        N = scanner.nextInt();

        int[][] A = new int[N][N];
        int[][] B = new int[N][N];

        System.out.println("Digite os valores da matriz A:");
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                B[i][j] = scanner.nextInt();
            }
        }

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Soma das Matrizes");
            System.out.println("2 - Multiplicação por Escalar");
            System.out.println("3 - Determinante");
            System.out.println("4 - Soma dos Elementos");
            System.out.println("0 - Sair do Programa");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SomaMatrizes(A, B);
                    break;
                case 2:
                    MultiplicacaoEscalar(A, B);
                    break;

                case 3:
                    Determinante(A, B);
                    break;
            
                case 4:
                    SomaElementos(A, B);
                    break;
                
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
            }
        }while (choice!=0);

        scanner.close();
    }

    public static void SomaMatrizes(int[][] A, int[][] B){
        int[][] C = new int[A.length][A.length];

        for (int i=0; i<A.length; i++){
            for (int j=0; j<A.length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("A soma das matrizes é:");
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A.length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void MultiplicacaoEscalar(int[][] A, int[][] B){
        Scanner scanner = new Scanner(System.in);
        int[][] C = new int[A.length][A.length];
        int[][] D = new int[A.length][A.length];
        int escalar;

        System.out.println("Digite o valor do escalar:");
        escalar = scanner.nextInt();

        for (int i=0; i<A.length; i++){
            for (int j=0; j<A.length; j++){
                C[i][j] = escalar * A[i][j];
                D[i][j] = escalar * B[i][j];
            }
        }

        System.out.println("\nA multiplicação por escalar é:");
        System.out.println("Matriz A:");
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A.length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B:");
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A.length; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Determinante(int[][] A, int[][] B){
        int detA = 0, detB = 0;

        if(A.length == 1){
            detA = A[0][0];
            detB = B[0][0];

            System.out.println("\nO determinante da matriz A é: " + detA);
            System.out.println("O determinante da matriz B é: " + detB);
        }
        else if(A.length == 2){
            detA = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
            detB = (B[0][0] * B[1][1]) - (B[0][1] * B[1][0]);

            System.out.println("\nO determinante da matriz A é: " + detA);
            System.out.println("O determinante da matriz B é: " + detB);
        }
        else if(A.length == 3){
            detA = (A[0][0] * A[1][1] * A[2][2]) + (A[0][1] * A[1][2] * A[2][0]) + (A[0][2] * A[1][0] * A[2][1]) - (A[0][2] * A[1][1] * A[2][0]) - (A[0][1] * A[1][0] * A[2][2]) - (A[0][0] * A[1][2] * A[2][1]);
            detB = (B[0][0] * B[1][1] * B[2][2]) + (B[0][1] * B[1][2] * B[2][0]) + (B[0][2] * B[1][0] * B[2][1]) - (B[0][2] * B[1][1] * B[2][0]) - (B[0][1] * B[1][0] * B[2][2]) - (B[0][0] * B[1][2] * B[2][1]);
            
            System.out.println("\nO determinante da matriz A é: " + detA);
            System.out.println("O determinante da matriz B é: " + detB);
        }
        else{
            System.out.println("\nNão sei usar Laplace e Sarrus, desculpa.");
        }
        
        System.out.println();
    }

    public static void SomaElementos(int[][] A, int[][] B){
        int somaA = 0;
        int somaB = 0;

        for (int i=0; i<A.length; i++){
            for (int j=0; j<A.length; j++){
                somaA += A[i][j];
                somaB += B[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz A é: " + somaA);
        System.out.println("A soma dos elementos da matriz B é: " + somaB);

        if(somaA > somaB){
            System.out.println("A matriz A tem a maior soma.\n");
        }
        else if(somaA < somaB){
            System.out.println("A matriz B tem a maior soma.\n");
        }
        else{
            System.out.println("As matrizes tem a mesma soma.\n");
        }
    }
}
