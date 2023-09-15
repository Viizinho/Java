import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String login, senha;
        
        System.out.println("Insira seu Login: ");
        login = scanner.nextLine();

        System.out.println("Insira sua Senha: ");
        senha = scanner.nextLine();

        if (login.equals(senha)){
            System.out.println("Erro! Login e Senha não podem ser iguais!");
        } 
        else if(senha.length() < 8){
            System.out.println("Erro! Senha curta demais!");
        }
        else if(senhaCorreta(senha)){
            System.out.println("Login e Senha cadastrados!");
        }
        else{
            System.out.println("Erro! Senha inválida!");
        }
        scanner.close();
    }

    public static boolean senhaCorreta(String password) {
        boolean letraMaiuscula = false, letraMinuscula = false, temDigito = false;
        
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                letraMaiuscula = true;
            } else if (Character.isLowerCase(ch)) {
                letraMinuscula = true;
            } else if (Character.isDigit(ch)) {
                temDigito = true;
            }
            
            if (letraMaiuscula && letraMinuscula && temDigito) {
                return true;
            }
        }
        
        return false;
    }
}
