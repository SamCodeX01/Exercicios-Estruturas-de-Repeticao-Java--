import java.util.Scanner;

public class Ex05_DescontoProgressivo {

        /*5. Desconto progressivo
        Para uma loja, aplique descontos progressivos: a cada 10 produtos comprados,
        dê 10% de desconto no total. Use for para simular clientes comprando diferentes quantidades.
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, desconto = 0.10, total = 0;

        for (int i = 1; i < 41; i++) {
            System.out.println("Produto: " + i);

            System.out.println("Digite o preço: ");
            preco = sc.nextDouble();

            total = total + preco;
            double x = (total*10)*0.1;

            if(i >= 10 && i < 20){
                System.out.println("aplicar desconto de 10");
            }
            if(i >= 20 && i < 30){
                System.out.println("aplicar desconto de 20");
                //condição de saida é só usar o break
            }
            if(i >= 30 && i < 40){
                System.out.println("aplicar desconto de 30");
                //condição de saida é só usar o break
            }
            if(i >= 40 && i < 50) {
                System.out.println("aplicar desconto de 40");
                //condição de saida é só usar o break
            }



        }
        //System.out.print("Total: " + total);
    }
}


