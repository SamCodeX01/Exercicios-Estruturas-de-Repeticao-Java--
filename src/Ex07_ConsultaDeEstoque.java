/*7. Consulta de estoque
Após cadastrar produtos, mostre todos os produtos com quantidade maior que zero, usando while.
*/

import java.util.Scanner;

public class Ex07_ConsultaDeEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome produto ou 'S' para sair: ");
            String prodNome = sc.next();
            System.out.print("Digite a quantidade do produto: ");
            int qtd = sc.nextInt();


            // mostre todos os produtos com quantidade maior que zero, usando while.

            if (prodNome.equalsIgnoreCase("S")) {
                System.out.println("Você digitou 'S' para sair!");
                break;
            }

        }

        if(qtd>3){
            System.out.println(qtd);;
        }
    }
}
