import java.util.Scanner;

public class Ex05_DescontoProgressivo {

        /*5. Desconto progressivo
        Para uma loja, aplique descontos progressivos: a cada 10 produtos comprados,
        dê 10% de desconto no total. Use for para simular clientes comprando diferentes quantidades.
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, total = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("Produto: " + i);
            System.out.print("Digite o preço: ");
            preco = sc.nextDouble();
            total = total + preco;
        }
        //System.out.print("Total: " + total);
    }
}

Com certeza\!
A simulação
da regra "a cada 10 produtos"
é a parte principal do
exercício.O segredo para fazer
isso de forma simples está em como a
linguagem Java(e a maioria das outras) lida com a **
divisão de
números inteiros**.

        ###
O Conceito
Chave:
Divisão de
Inteiros

Quando você divide dois

números inteiros(`int`) em Java,o resultado também é um número inteiro.
A parte
decimal é

simplesmente descartada(não há arredondamento).

É exatamente
isso que
precisamos para
contar quantos "grupos de 10"
existem em
uma quantidade.

Veja os
exemplos:

        *
Se um
cliente compra `23`produtos: `23/10`
resulta em `2` (o `,3`
é ignorado).
        *
Se um
cliente compra `19`produtos: `19/10`
resulta em `1`.
        *
Se um
cliente compra `30`produtos: `30/10`
resulta em `3`.
        *
Se um
cliente compra `9`produtos: `9/10`
resulta em `0`.

O resultado
dessa divisão
nos dá
exatamente o
número de
vezes que
o desconto
de 10%
deve ser
aplicado .

###
Código Focado
na Simulação

Para tornar
a simulação
ainda mais
clara,
vamos modificar
o código
anterior.Em vez
de testar 4
        casos fixos, vamos
usar um
laço `for`
para simular
a compra
de 1até 40
produtos e
mostrar o
que acontece
com o
desconto em
cada etapa.

        Neste exemplo, vamos
imprimir o
status a
cada 5
produtos para
que a
saída não
fique muito
longa,
mas a
lógica é
calculada para
cada um.

        ```java

public class SimulacaoDesconto {

    public static void main(String[] args) {

        double precoPorProduto = 10.0; // Preço mais simples para facilitar a visualização

        System.out.println("Iniciando simulação de desconto progressivo...");
        System.out.println("---------------------------------------------");
        System.out.println("Regra: A cada 10 produtos, o desconto total aumenta em 10%.\n");

        // O laço 'for' irá simular um cliente comprando de 1 até 40 produtos.
        // A variável 'quantidade' representa o total de itens no carrinho.
        for (int quantidade = 1; quantidade <= 40; quantidade++) {

            // ---> AQUI ESTÁ A LÓGICA PRINCIPAL <---
            // 1. Contamos quantos grupos de 10 produtos existem usando a divisão de inteiros.
            int gruposDeDez = quantidade / 10;

            // 2. Multiplicamos os grupos por 10 para ter a porcentagem total de desconto.
            int porcentagemDeDesconto = gruposDeDez * 10;

            double valorBruto = quantidade * precoPorProduto;
            double valorDoDesconto = valorBruto * (porcentagemDeDesconto / 100.0);
            double valorFinal = valorBruto - valorDoDesconto;

            // Para não poluir a tela, vamos imprimir o resultado
            // apenas para algumas quantidades específicas (a cada 5 itens, por exemplo).
            if (quantidade % 5 == 0 || quantidade == 1 || quantidade == 9 || quantidade == 10 || quantidade == 11 || quantidade == 19 || quantidade == 20) {
                System.out.println(
                        "Qtd: " + String.format("%02d", quantidade) +
                                " | Grupos de 10: " + gruposDeDez +
                                " | Desconto: " + String.format("%02d", porcentagemDeDesconto) + "%" +
                                " | Valor Final: R$" + String.format("%.2f", valorFinal)
                );
            }
        }
        System.out.println("---------------------------------------------");
    }
}
```

        ###Saída do
Código de
Simulação

Ao rodar
este novo
código,
a saída
será muito
clara,
mostrando como
o desconto
evolui:

        ```
Iniciando simulação
de desconto
progressivo...
        ---------------------------------------------
Regra:
A cada 10produtos,
o desconto
total aumenta
em 10%.

Qtd:01|
Grupos de 10:0|Desconto:00%|
Valor Final:R$10,00
Qtd:05|
Grupos de 10:0|Desconto:00%|
Valor Final:R$50,00
Qtd:09|
Grupos de 10:0|Desconto:00%|
Valor Final:R$90,00
Qtd:10|
Grupos de 10:1|Desconto:10%|
Valor Final:R$90,00
Qtd:11|
Grupos de 10:1|Desconto:10%|
Valor Final:R$99,00
Qtd:15|
Grupos de 10:1|Desconto:10%|
Valor Final:R$135,00
Qtd:19|
Grupos de 10:1|Desconto:10%|
Valor Final:R$171,00
Qtd:20|
Grupos de 10:2|Desconto:20%|
Valor Final:R$160,00
Qtd:25|
Grupos de 10:2|Desconto:20%|
Valor Final:R$200,00
Qtd:30|
Grupos de 10:3|Desconto:30%|
Valor Final:R$210,00
Qtd:35|
Grupos de 10:3|Desconto:30%|
Valor Final:R$245,00
Qtd:40|
Grupos de 10:4|Desconto:40%|
Valor Final:R$240,00
        ---------------------------------------------
        ```

Observe na
saída:

        *De 1a 9produtos,o "Grupos de 10"é **0**
e o
desconto é **0%**.
        *
Assim que
a quantidade
chega em **10**,o "Grupos de 10"vira **1**
e o
desconto salta
para **10%**.
Ele permanece
em 10%
para as
quantidades 11,15e 19.
        *
Quando a
quantidade chega
em **20**,o "Grupos de 10"vira **2**
e o
desconto salta
para **20%**.

Portanto,
a simulação
da regra "a cada 10"
é resolvida
de forma
elegante e
eficiente pela
simples linha:
        `
int porcentagemDeDesconto = (quantidade / 10) * 10;`