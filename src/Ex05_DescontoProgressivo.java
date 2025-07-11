import java.util.Scanner;

public class Ex05_DescontoProgressivo {

        /*5. Desconto progressivo
        Para uma loja, aplique descontos progressivos: a cada 10 produtos comprados,
        dê 10% de desconto no total. Use for para simular clientes comprando diferentes quantidades.
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, total = 0;

        for (int i = 1; i < 20; i++) {
            System.out.println("Produto: " + i);
            System.out.print("Digite o preço: ");
            preco = sc.nextDouble();

            if(i >= 10){
                System.out.println("aplicar desconto");
                //condição de saida é só usar o break
            }

            total = total + preco;
        }
        //System.out.print("Total: " + total);
    }
}


