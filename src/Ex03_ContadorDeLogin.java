import java.util.Scanner;

public class Ex03_ContadorDeLogin {
    public static void main(String[] args) {
/*Importe vários usuários e conte quantos tentaram login,
 usando while para registrar tentativas até atingir um limite (ex: 3 tentativas).*/
        Scanner sc = new Scanner(System.in);

        String loginCorreto = "sa";
        String loginDigitado;
        String senhaCorreta = "123";
        String senhaDigitada;
        int tentativas = 0, maxTentativas = 3;
        boolean logado = false;

        //while (!loginDigitado.equals(loginCorreto) || !senhaDigitada.equals(senhaCorreta)) {
        while (tentativas < maxTentativas) {
                    System.out.print("Login: ");
                    loginDigitado = sc.next();
                    System.out.print("Senha: ");
                    senhaDigitada = sc.next();

                if (loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta)) {
                    System.out.println("Login Efetuado com sucesso!");
                    logado = true;
                }
                 else{
                   tentativas++;
                   System.out.println("Login ou senha incorretos!");
                   System.out.println("Numero de tentativas: " + tentativas);
                   System.out.println("Numero de tentativas restantes: " + (maxTentativas - tentativas));
                 }
            }
                 if (!logado){
                   System.out.println("Numero de tentativas excedidas!");
                 }
        }
}
