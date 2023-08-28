import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nConversor de Temperaturas");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Celsius para Kelvin");
            System.out.println("4. Kelvin para Celsius");
            System.out.println("5. Fahrenheit para Kelvin");
            System.out.println("6. Kelvin para Fahrenheit");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
                case 3:
                    celsiusToKelvin();
                    break;
                case 4:
                    kelvinToCelsius();
                    break;
                case 5:
                    fahrenheitToKelvin();
                    break;
                case 6:
                    kelvinToFahrenheit();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("\nTemperatura em Fahrenheit: " + fahrenheit);
    }

    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("\nTemperatura em Celsius: " + celsius);
    }

    public static void celsiusToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println("\nTemperatura em Kelvin: " + kelvin);
    }

    public static void kelvinToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Kelvin: ");
        double kelvin = scanner.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.println("\nTemperatura em Celsius: " + celsius);
    }

    public static void fahrenheitToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double kelvin = (fahrenheit + 459.67) * 5/9;
        System.out.println("\nTemperatura em Kelvin: " + kelvin);
    }

    public static void kelvinToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Kelvin: ");
        double kelvin = scanner.nextDouble();
        double fahrenheit = kelvin * 9/5 - 459.67;
        System.out.println("\nTemperatura em Fahrenheit: " + fahrenheit);
    }
}
