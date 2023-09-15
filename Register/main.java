package Register;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numCadastros;
        do {
            System.out.print("Digite o número de pessoas que deseja cadastrar (entre 1 e 10): ");
            numCadastros = scanner.nextInt();
            
            if (numCadastros < 1 || numCadastros > 10) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (numCadastros < 1 || numCadastros > 10);
        
        int[] idades = new int[numCadastros];
        double[] alturas = new double[numCadastros];
        
        for (int i = 0; i < numCadastros; i++) {
            System.out.println("\nCadastro da pessoa " + (i + 1) + ":");
            
            System.out.print("Digite a idade: ");
            idades[i] = scanner.nextInt();
            
            System.out.print("Digite a altura em metros: ");
            alturas[i] = scanner.nextDouble();
        }

        double mediaFaixa1 = 0, mediaFaixa2 = 0, mediaFaixa3 = 0, mediaFaixa4 = 0;
        int countFaixa1 = 0, countFaixa2 = 0, countFaixa3 = 0, countFaixa4 = 0;

        for (int i = 0; i < numCadastros; i++) {
            if (idades[i] <= 10) {
                mediaFaixa1 += alturas[i];
                countFaixa1++;
            } else if (idades[i] <= 15) {
                mediaFaixa2 += alturas[i];
                countFaixa2++;
            } else if (idades[i] <= 21) {
                mediaFaixa3 += alturas[i];
                countFaixa3++;
            } else {
                mediaFaixa4 += alturas[i];
                countFaixa4++;
            }
        }

        if (countFaixa1 > 0) {
            mediaFaixa1 /= countFaixa1;
            System.out.println("Média de altura para faixa etária 1 (até 10 anos): " + mediaFaixa1 + " metros");
        }

        if (countFaixa2 > 0) {
            mediaFaixa2 /= countFaixa2;
            System.out.println("Média de altura para faixa etária 2 (11 a 15 anos): " + mediaFaixa2 + " metros");
        }

        if (countFaixa3 > 0) {
            mediaFaixa3 /= countFaixa3;
            System.out.println("Média de altura para faixa etária 3 (16 a 21 anos): " + mediaFaixa3 + " metros");
        }

        if (countFaixa4 > 0) {
            mediaFaixa4 /= countFaixa4;
            System.out.println("Média de altura para faixa etária 4 (acima de 21 anos): " + mediaFaixa4 + " metros");
        }

        scanner.close();
    }
}

