/* Exercício 08 – É Anagrama
* Aluno: João Vitor Cardoso Beltrão – Matricula: 20220006134
*/


import java.util.Scanner;

public class EhAnagrama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String palavra1, palavra2;

        System.out.printf("Insira duas palavras: ");
        palavra1 = scanner.nextLine();
        palavra2 = scanner.nextLine();

        if (palavra1.length() != palavra2.length()){
            System.out.printf("Não é anagrama\n");
        }
        else {
            int[] letras = new int[26];
            for (int i=0; i<palavra1.length(); i++){
                letras[palavra1.charAt(i)-97]++;
                letras[palavra2.charAt(i)-97]--;
            }
            boolean anagrama = true;
            for (int i=0; i<26; i++){
                if (letras[i] != 0){
                    anagrama = false;
                    break;
                }
            }
            if (anagrama){
                System.out.printf("É anagrama\n");
            }
            else {
                System.out.printf("Não é anagrama\n");
            }
        }
        scanner.close();
    }
}
