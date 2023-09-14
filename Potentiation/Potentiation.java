package Potentiation;
import java.util.Scanner;

public class Potentiation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double base, resultado=1;
        int expoente;

        System.out.printf("Insira a base e o expoente, respectivamente: ");
        base = scanner.nextInt();
        expoente = scanner.nextInt();

        if (expoente==0){
            resultado = 1;
        }
        else if (expoente==1){
            resultado = base;
        }
        else {
            if (expoente>0){
                for (int i=0; i<expoente; i++){
                    resultado = resultado*base;
                }
            }
            else {
                base = 1/base;
                expoente = Math.abs(expoente);
                for (int i=1; i<=expoente; i++){
                    resultado = resultado*base;
                }
            }
        }
        
        System.out.printf("Resultado: "+resultado+"\n");
        
        scanner.close();
    }
}
