/* 06. Cadastro de produtos
Permita que o usuário cadastre até 50 produtos,
informando nome, preço e quantidade, usando for.
*/

import java.util.Scanner;

public class Ex06_CadastroDeProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, produto;
        int quantidade = 0, qtdTotal = 0;
        double preco = 0, total = 0;


        for(int i = 1; i <=50;i++){
            System.out.println("Produto: " + i);
            System.out.print("Nome: ");
            nome = scanner.next();
            produto = scanner.nextLine();
            System.out.print("Preço: ");
            preco = scanner.nextDouble();
            System.out.print("Quantidade: ");
            quantidade = scanner.nextInt();
            System.out.println("---------------");
            total = total + preco;
            qtdTotal = qtdTotal + quantidade;
        }

        System.out.println("Quantidade total: " + total);
        System.out.println("Preço total: " + total);















    }

}
