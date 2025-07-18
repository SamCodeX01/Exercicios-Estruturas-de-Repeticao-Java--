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
            System.out.print("Digite a quantidade do produto: ");
            int qtd = sc.nextInt();

// mostre todos os produtos com quantidade maior que zero, usando while.

            if (prodNome.equalsIgnoreCase("S")) {
                System.out.println("Você digitou 'S' para sair!");
                break;
            }
        }

        /*
        * produtos é um array de objetos Produto
          Cada Produto tem um método getQuantidade()
          O loop percorre todos os produtos e imprime apenas os com quantidade > 0
        * */

    }
}


/*
Aqui está um exemplo simples em Java usando `while` para mostrar produtos com quantidade maior que zero:

```java
int i = 0;
while (i < produtos.length) {
    if (produtos[i].getQuantidade() > 0) {
        System.out.println(produtos[i]);
    }
    i++;
}
```

Onde:
- `produtos` é um array de objetos Produto
- Cada Produto tem um método `getQuantidade()`
- O loop percorre todos os produtos e imprime apenas os com quantidade > 0
*/