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
                System.out.print("\n Você escolheu o exercício 1: ");
                System.out.println("*Autenticação de usuário*");
                System.out.println("-Login: Sam / Senha: 1234-");
                Ex01_AutenticacaoDeUsuario.main(args);
                break;
            case 2:
                System.out.println("Você escolheu o exercício 2: ");
                System.out.println("*Cadastro de Clientes*");
                Ex02_CadastroDeClientes.main(args);
                break;
            case 3:
                System.out.println("Você escolheu o exercício 3: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 4:
                System.out.println("Você escolheu o exercício 4: ");
                System.out.println("===Autenticação de usuário===");
                Ex04_Lojas.main(args);
                break;
            case 5:
                System.out.println("Você escolheu o exercício 5: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 6:
                System.out.println("Você escolheu o exercício 6: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 7:
                System.out.println("Você escolheu o exercício 7: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 8:
                System.out.println("Você escolheu o exercício 8: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 9:
                System.out.println("Você escolheu o exercício 9: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 10:
                System.out.println("Você escolheu o exercício 10: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 11:
                System.out.println("Você escolheu o exercício 11: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 12:
                System.out.println("Você escolheu o exercício 12: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 13:
                System.out.println("Você escolheu o exercício 13: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 14:
                System.out.println("Você escolheu o exercício 14: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 15:
                System.out.println("Você escolheu o exercício 15: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 16:
                System.out.println("Você escolheu o exercício 16: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 17:
                System.out.println("Você escolheu o exercício 17: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 18:
                System.out.println("Você escolheu o exercício 18: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 19:
                System.out.println("Você escolheu o exercício 19: ");
                System.out.println("===Autenticação de usuário===");
                break;
            case 20:
                System.out.println("Você escolheu o exercício 20: ");
                System.out.println("===Autenticação de usuário===");
                break;
        }

    }
}
