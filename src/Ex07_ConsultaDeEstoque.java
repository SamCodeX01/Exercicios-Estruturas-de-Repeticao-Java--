/*7. Consulta de estoque
Após cadastrar produtos, mostre todos os produtos com quantidade maior que zero, usando while.
*/

import java.util.Scanner;

public class Ex07_ConsultaDeEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do produto ou 'S' para sair: ");
            String prodNome = sc.next();

            if (prodNome.equalsIgnoreCase("S")) {
                    System.out.println("Você digitou 'S' para sair!");
                    break;
                }

            System.out.print("Digite a quantidade do produto: ");
            int qtd = sc.nextInt();

        }

    }
}

/* Scanner scanner = new Scanner(System.in);
	    String produtos = "";
	    String valores = "";

	    while (true) {
	        System.out.print("\nInforme o nome do produto ou 'S' para sair: ");
	        String nomeProduto = scanner.next();

	        if (nomeProduto.equalsIgnoreCase("S")) {
                System.out.println("Você digitou 'S' para sair! \n");
                break;
            }

            System.out.print("Digite a quantidade do produto: ");
            String valorProduto = scanner.next();

            produtos = produtos + "," + nomeProduto;
            valores = valores + "," + valorProduto;
	    }

	    String[] listaProdutos = produtos.split(",");
	    String[] listaValores = valores.split(",");

	    System.out.print("LISTA DE PRODUTOS \n");
	    for (int i=1; i<listaProdutos.length; i++) {
	        if (Float.parseFloat(listaValores[i].trim()) > 0.0f)
	            System.out.println(listaProdutos[i] + "          " + listaValores[i]);
	    }
	}
	*/