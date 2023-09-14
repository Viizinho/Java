package Quadratic;
import java.util.Scanner;

public class Quadratic {
    public static void main (String[] args){
        double a, b, c, delta, r1, r2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print ("Digite os valores A, B e C da equação: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a != 0){
            delta = Math.pow(b , 2) - (4 * a * c);

            if (delta > 0){
                r1 = (-b + Math.sqrt(delta)) / (2 * a);
                r2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println ("As raízes da equação são: " + r1 + " e " + r2);
            } else if (delta == 0){
                r1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println ("A raiz da equação é: " + r1);
            } else {
                System.out.println ("A equação não possui raízes reais.");
            }
        }
        scanner.close();
    }    
}
