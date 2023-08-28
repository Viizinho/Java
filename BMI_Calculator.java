import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em KG: ");
        peso = scanner.nextDouble();

        System.out.print("Digite seu altura em metros: ");
        altura = scanner.nextDouble();

        imc = peso / (altura*altura);

        if (imc < 17) {
            System.out.print ("\nIMC: " + imc + "\nMuito abaixo do peso\n");
        }
        else if (imc < 18.5) {
            System.out.print ("\nIMC: " + imc + "\nAbaixo do peso\n");
        }
        else if (imc < 25) {
            System.out.print ("\nIMC: " + imc + "\nPeso normal\n");
        }
        else if (imc < 30) {
            System.out.print ("\nIMC: " + imc + "\nAcima do peso\n");
        }
        else if (imc < 35) {
            System.out.print ("\nIMC: " + imc + "\nObesidade grau I\n");
        }
        else if (imc < 40) {
            System.out.print ("\nIMC: " + imc + "\nObesidade grau II\n");
        }
        else {
            System.out.print ("\nIMC: " + imc + "\nObesidade grau III\n");
        }
        scanner.close();
    }
}
