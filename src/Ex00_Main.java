import java.util.Scanner;

public class Ex00_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("*****Escolha um Exercício*****\n" +
                "1. Autenticação de usuário\n" +
                "2. Cadastro de clientes\n" +
                "3. Contador de login\n" +
                "4. Loja: Carrinho de compras\n" +
                "5. Desconto progressivo\n" +
                "6. Cadastro de produtos\n" +
                "7. Consulta de estoque\n" +
                "8. Empréstimo bancário\n" +
                "9. Verificação de pedidos\n" +
                "10. Lista de aprovados\n" +
                "11. Sistema de votos\n" +
                "12. Calculadora de média\n" +
                "13. Simulação de fila\n" +
                "14. Intervalo de descontos\n" +
                "15. Controle de estoque de estoque\n" +
                "16. Contador de visitas\n" +
                "17. Cadastro de vagas de emprego\n" +
                "18. Preço médio de produtos\n" +
                "19. Lista de espera\n" +
                "20. Pagamento parcelado\n\n" +
                "Digite aqui o Exercício escolhido: ");
                int ex = sc.nextInt();

        switch (ex) {
            case 1:
                System.out.println("\n Você escolheu o exercício 1: ");
                System.out.println("===Autenticação de usuário===\n");
                System.out.println("-Login: Sam / Senha: 1234-");
                Ex01_AutenticacaoDeUsuario.main(args);
                break;
            case 2:
                System.out.println("Você escolheu o exercício 2: ");
                System.out.println("===Cadastro de Clientes===\n");
                Ex02_CadastroDeClientes.main(args);
                break;
            case 3:
                System.out.println("Você escolheu o exercício 3: ");
                System.out.println("===Contador de login===\n");
                Ex03_ContadorDeLogin.main(args);
                break;
            case 4:
                System.out.println("Você escolheu o exercício 4: ");
                System.out.println("===Loja: Carrinho de compras===\n");
                Ex04_Lojas.main(args);
                break;
            case 5:
                System.out.println("Você escolheu o exercício 5: ");
                System.out.println("===Desconto progressivo===\n");
                Ex05_DescontoProgressivo.main(args);
                break;
            case 6:
                System.out.println("Você escolheu o exercício 6: ");
                System.out.println("===Cadastro de produtos===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 7:
                System.out.println("Você escolheu o exercício 7: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 8:
                System.out.println("Você escolheu o exercício 8: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 9:
                System.out.println("Você escolheu o exercício 9: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 10:
                System.out.println("Você escolheu o exercício 10: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 11:
                System.out.println("Você escolheu o exercício 11: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 12:
                System.out.println("Você escolheu o exercício 12: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 13:
                System.out.println("Você escolheu o exercício 13: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 14:
                System.out.println("Você escolheu o exercício 14: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 15:
                System.out.println("Você escolheu o exercício 15: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                Ex06_CadastroDeProdutos.main(args);
                break;
            case 16:
                System.out.println("Você escolheu o exercício 16: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                break;
            case 17:
                System.out.println("Você escolheu o exercício 17: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                break;
            case 18:
                System.out.println("Você escolheu o exercício 18: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                break;
            case 19:
                System.out.println("Você escolheu o exercício 19: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                break;
            case 20:
                System.out.println("Você escolheu o exercício 20: ");
                System.out.println("===xxxxxxxxxxxxxxxxxx===\n");
                break;
        }

    }
}
/*
20 Exercícios com Estruturas de Repetição em Java (Contexto Cotidiano)

1. Autenticação de usuário
Faça um programa que peça a senha do usuário até que ela esteja correta (1234).

2. Cadastro de clientes
Crie um sistema que permita cadastrar N clientes, solicitando nome e telefone, usando for para repetir N vezes.

3. Contador de login
Importe vários usuários e conte quantos tentaram login, usando while para registrar tentativas até atingir um limite (ex: 3 tentativas).

4. Loja: Carrinho de compras
Implemente um menu que permite o usuário inserir o preço de vários produtos até decidir parar (ex: digitar 0 para sair). No final, exiba o total.

5. Desconto progressivo
Para uma loja, aplique descontos progressivos: a cada 10 produtos comprados, dê 10% de desconto no total. Use for para simular clientes comprando diferentes quantidades.

6. Cadastro de produtos
Permita que o usuário cadastre até 50 produtos, informando nome, preço e quantidade, usando for.

7. Consulta de estoque
Após cadastrar produtos, mostre todos os produtos com quantidade maior que zero, usando while.

8. Empréstimo bancário
Peça ao usuário o valor desejado e o número de parcelas, e calcule o valor de cada parcela, repetindo a solicitação até uma entrada válida usando do...while.

9. Verificação de pedidos
Leia N números inteiros representando pedidos, e conte quantos pedidos têm valor acima de R$100, usando for ou while.

10. Lista de aprovados
Leia a nota de vários estudantes até que o usuário decida parar, e exiba a quantidade de aprovados (nota >= 7).

11. Sistema de votos
Permita que várias pessoas votem em uma eleição (candidatos 1, 2 ou 3), até decidir parar. Conte votos para cada candidato usando while.

12. Calculadora de média
Leia várias notas de um aluno até que seja informado um valor negativo, e calcule a média.

13. Simulação de fila
Crie uma fila de clientes esperando na loja. Adicione clientes (nome) até que o operador encerre, usando while.

14. Intervalo de descontos
Para uma promoção, solicite a quantidade de compras feitas por diferentes clientes e aplique desconto se a compra passar de uma quantidade específica. Use for.

15. Controle de estoque de estoque
Verifique repetidamente a quantidade de estoque até que o estoque esteja zero, usando while.

16. Contador de visitas
Conte quantas pessoas entraram em uma loja, até o responsável dizer que ninguém mais entrou (0 como entrada para terminar).

17. Cadastro de vagas de emprego
Insira diferentes candidatos até o gerente decidir parar, usando do...while. Depois, exiba todos os candidatos inseridos.

18. Preço médio de produtos
Permita que o usuário insira preços de vários produtos até digitar 0, e exiba o valor médio.

19. Lista de espera
Adicione nomes de clientes em uma lista de espera para atendimento até um limite de pessoas, usando for.

20. Pagamento parcelado
Leia o valor total da compra e o número de parcelas; calcule e exiba o valor de cada parcela, repetindo a entrada até uma condição válida usar do...while.

* */