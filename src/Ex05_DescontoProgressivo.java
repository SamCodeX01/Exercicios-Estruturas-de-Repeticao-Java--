import java.util.Scanner;

public class Ex05_DescontoProgressivo {

        /*5. Desconto progressivo
        Para uma loja, aplique descontos progressivos: a cada 10 produtos comprados,
        dê 10% de desconto no total. Use for para simular clientes comprando diferentes quantidades.
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, total = 0;

        for (int i = 1; i < 40; i++) {
            System.out.println("Produto: " + i);

            System.out.print("Digite o preço: ");
            preco = sc.nextDouble();

           // total = total + preco;

            if(preco == 0){
                System.out.println("DESCONTO");
            }else{
                break;
            }


//            if(i >= 10 && i <21){
//                System.out.println("desconto 10%");
//                 if(i == 0){
//                break;
//                }
//            }

            }

//
//            if(i >= 10 && i <21){
//                System.out.println("aplicar desconto de 10%");
//                //condição de saida é só usar o break
//            }
//            if(i >= 20 && i < 31){
//                System.out.println("aplicar desconto de 20%");
//                //condição de saida é só usar o break
//            }
//            if(i >= 30 && i < 41){
//                System.out.println("aplicar desconto de 30%");
//                //condição de saida é só usar o break
//            }

            System.out.println();

        }
        //System.out.print("Total: " + total);

}


