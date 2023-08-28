import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Dobro");
            System.out.println("2 - Triplo");
            System.out.println("3 - Metade");
            System.out.println("4 - Quadrado");
            System.out.println("5 - Cubo");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("7 - Raiz Cúbica");
            System.out.println("8 - Módulo");
            System.out.println("9 - Inverso");
            System.out.println("0 - Sair do Programa");

            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                Dobro();
                break;
            case 2:
                Triplo();
                break;
            case 3:
                Metade();
                break;
            case 4:
                Quadrado();
                break;
            case 5:
                Cubo();
                break;
            case 6:
                RaizQuadrada();
                break;
            case 7:
                RaizCubica();
                break;
            case 8:
                Modulo();
                break;
            case 9:
                Inverso();
                break;
            case 0:
                System.out.println("Encerrando o programa.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");

            choice = scanner.nextInt();
        } 
    } while (choice!=0);
        scanner.close();
    }

    public static void Dobro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        int resultado = n * 2;
        System.out.println("O dobro de " + n + " é " + resultado + "\n");
    }

    public static void Triplo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        int resultado = n * 3;
        System.out.println("O triplo de " + n + " é " + resultado + "\n");
    }

    public static void Metade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        double resultado = n / 2;
        System.out.println("A metade de " + n + " é " + resultado + "\n");
    }

    public static void Quadrado(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        int resultado = n * n;
        System.out.println("O quadrado de " + n + " é " + resultado + "\n");
    }

    public static void Cubo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        int resultado = n * n * n;
        System.out.println("O cubo de " + n + " é " + resultado + "\n");
    }

    public static void RaizQuadrada(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        double resultado = Math.sqrt(n);
        System.out.println("A raiz quadrada de " + n + " é aproximadamente " + resultado + "\n");
    }

    public static void RaizCubica(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        double resultado = Math.cbrt(n);
        System.out.println("A raiz cúbica de " + n + " é aproximadamente " + resultado + "\n");
    }

    public static void Modulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        int resultado = Math.abs(n);
        System.out.println("O modulo de " + n + " é " + resultado + "\n");
    }

    public static void Inverso(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        double resultado = Math.pow(n, -1);
        System.out.println("O inverso de " + n + " é " + resultado + "\n");
    }
}
