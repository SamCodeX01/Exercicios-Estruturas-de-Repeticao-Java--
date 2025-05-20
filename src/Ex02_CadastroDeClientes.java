import java.util.Scanner;

/*2. Cadastro de clientes
Crie um sistema que permita cadastrar N clientes,
solicitando nome e telefone, usando for para repetir N vezes.
*/
public class Ex02_CadastroDeClientes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cliente, telefone,simOuNao;

        do{
            System.out.print("Cliente: ");
            cliente = sc.next();

            System.out.print("Telefone: ");
            telefone = sc.next();

            System.out.println("Digite S para continuar ou N para Sair ");
            simOuNao = sc.next();
        }
        while(simOuNao.equalsIgnoreCase("S"));
    }
}
