import java.sql.Array;
import java.util.Scanner;

public class Ex000_PopulandoUmArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        int [] tamanho = new int[numero];

        for(i = 0; i < tamanho.length; i++){
            System.out.println(i);
        }

    }
}
/*
Scanner sc = new Scanner(System.in);

System.out.print("Quantos números deseja digitar? ");
int tamanho = sc.nextInt();

int[] numeros = new int[tamanho]; // Cria um array com o tamanho desejado

for (int i = 0; i < numeros.length; i++) {
    System.out.print("Digite um número: ");
    numeros[i] = sc.nextInt(); // Armazena no índice i
}

sc.close();
------------------------------------------------------------------------------------------------------------------
* import java.util.Scanner;

public class ProdutosComScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays para armazenar os produtos (vamos limitar a 100 por simplicidade)
        String[] nomes = new String[100];
        int[] quantidades = new int[100];
        int totalProdutos = 0;

        System.out.println("Cadastro de Produtos (digite 'sair' para encerrar)");

        // Cadastro dos produtos
        while (true) {
            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            nomes[totalProdutos] = nome;
            quantidades[totalProdutos] = quantidade;
            totalProdutos++;
        }

        // Mostrar produtos com quantidade > 0
        System.out.println("\nProdutos com quantidade maior que zero:");
        int i = 0;
        while (i < totalProdutos) {
            if (quantidades[i] > 0) {
                System.out.println(nomes[i] + " - Quantidade: " + quantidades[i]);
            }
            i++;
        }

        scanner.close();
    }
}

*/