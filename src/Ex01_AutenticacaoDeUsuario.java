import java.util.Scanner;

public class Ex01_AutenticacaoDeUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String login, senha;


        do {
            System.out.print("Digite o seu Login: ");
            login = sc.nextLine();

            System.out.print("Digite a sua senha: ");
            senha = sc.nextLine();

            if (!login.equals("Sam") && !senha.equals("1234")){
                System.out.println("Senha incorreta!");
            }
        }
           while (!login.equals("Sam") || !senha.equals("1234"));
           System.out.println("Logando na conta!");
           System.exit(0);
   }

}

