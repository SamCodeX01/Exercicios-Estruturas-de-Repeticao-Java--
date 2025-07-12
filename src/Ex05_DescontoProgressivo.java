import java.util.Scanner;

public class Ex05_DescontoProgressivo {

        /*5. Desconto progressivo
        Para uma loja, aplique descontos progressivos: a cada 10 produtos comprados,
        dê 10% de desconto no total. Use for para simular clientes comprando diferentes quantidades.
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double preco;

        for (int i = 1; i < 12; i++) {
            System.out.println("Produto: " + i);
            System.out.print("Digite o preço ou `s` para sair: ");
            //preco = sc.nextDouble();

            if (sc.hasNext("s")){//Verifica se a entrada é "s" antes de ler como double
                sc.next(); //Consome o "s" do buffer
                System.out.println("saindo...");
                break;
            }
            else if(sc.hasNextDouble()){// Se não for "s", tenta ler como double
                preco = sc.nextDouble();
                total += preco;
            }
            else{
                System.out.println("Digite `s` ou um valor válido!");
                sc.next(); // Limpa o buffer
                i--; // Repete a iteração
            }

            if(i >= 10 && i <=20){
                 System.out.println("desconto 10%");
            }
            else if(i >= 21 && i <=30){
                 System.out.println("desconto 20%");
            }
            else if(i >= 31 && i <=40){
                 System.out.println("desconto 30%");
            }
        }
        System.out.println("Valor total: " + total);
    }
}


