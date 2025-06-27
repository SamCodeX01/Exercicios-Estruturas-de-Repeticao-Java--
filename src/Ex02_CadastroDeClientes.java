import java.util.Scanner;

/*2. Cadastro de clientes
Crie um sistema que permita cadastrar N clientes,
solicitando nome e telefone, usando for para repetir N vezes.
*/
public class Ex02_CadastroDeClientes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cliente, telefone;
        int qtd;

        System.out.print("Quantos clientes deseja cadastrar? ");
        qtd = sc.nextInt();

            for(int i = 0; i < qtd ; i++){
                System.out.print("Cliente: ");
                cliente = sc.next();
                System.out.print("Telefone: ");
                telefone = sc.next();
            }
    }
}
