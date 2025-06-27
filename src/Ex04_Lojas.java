import java.util.Scanner;

/*4. Loja: Carrinho de compras
Implemente um menu que permite o usuário inserir o preço
de vários produtos até decidir parar
(ex: digitar 0 para sair). No final, exiba o total.
*/
public class Ex04_Lojas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double p1, p2, p3, p4;
        String x;

        do {
        System.out.println("Insira o preço dos produtos: ");

            System.out.print("Produto 1: ");
            p1 = sc.nextDouble();
            System.out.print("Produto 2: ");
            p2 = sc.nextDouble();
            System.out.print("Produto 3: ");
            p3 = sc.nextDouble();
            System.out.print("Produto 4: ");
            p4 = sc.nextDouble();

            System.out.println("Digite S para sair ou M para mostrar o resultado: ");
            x = sc.next();

            if (x.equalsIgnoreCase("m")){
                Double resultado = p1+p2+p3+p4;
                System.out.print("Resultado: " + resultado);
            }
        }
        while(x.equalsIgnoreCase("m"));
        System.exit(0);

    }
}
