import java.sql.Array;
import java.util.Scanner;
/*7. Consulta de estoque
Após cadastrar produtos, mostre todos os produtos
com quantidade maior que zero, usando while.
*/

public class Ex000_PopulandoUmArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer guardar? ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho]; //Cria o array com tamanho escolhido

        int i = 0; //Variável para controlar a posição no array

        while (i < tamanho) { //Enquanto 0 for menor que o tamanho digitado, faça o loop
            System.out.print("Digite o " + (i + 1) + "° número: "); //(i + 1) faz a contagem começar em 1 em vez de 0.
            numeros[i] = sc.nextInt();
            i++;
            //Se não tiver o i++, o while ficara preso no mesmo valor de i para sempre!
            //O programa sempre pediria o 1º número (i = 0 eternamente).
            //Loop infinito! ⚠️
        }

        System.out.println("\nNúmeros digitados: ");
        for (int num : numeros) {//Para cada número "num" dentro do array numeros, faça:
            System.out.println(num); //Mostra os números guardados no Array
        }

    }
}
