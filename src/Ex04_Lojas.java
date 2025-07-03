import java.util.Scanner;

/*4. Loja: Carrinho de compras
Implemente um menu que permite o usuário inserir o preço
de vários produtos até decidir parar
(ex: digitar 0 para sair). No final, exiba o total.
*/
public class Ex04_Lojas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double preco, total = 0;
        String situacao;

        do{
            contador++;
            System.out.print("Produto: " + contador + "\n");
            System.out.print("Preço: ");
            preco = sc.nextDouble();
            total = total + preco; // Acumula no total (não no preço individual)
            System.out.println("Preço inserido!");
            System.out.println("Digite C para Continuar ou S para Sair!");
            situacao = sc.next();
            System.out.println("------***-----");
        }
        while(!situacao.equalsIgnoreCase("s"));
            System.out.println("Total: " + total);
    }
}
