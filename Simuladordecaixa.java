import java.util.Scanner;
public class Simuladordecaixa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 1000.0;
        int opcao;

        while (true) {

            System.out.println("Caixa Eletrônico");
            System.out.println("1  Depositar");
            System.out.println("2  Sacar");
            System.out.println("3  Ver saldo");
            System.out.println("4  Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor para depósito: ");
                double deposito = entrada.nextDouble();

                if (deposito > 0)
                    saldo += deposito;
                else
                    System.out.println("Valor inválido!");
            }

            else if (opcao == 2) {
                System.out.print("Digite o valor para saque: ");
                double saque = entrada.nextDouble();

                if (saque > 0 & saque <= saldo)
                    saldo -= saque;
                else
                    System.out.println("Saque inválido!");
            }

            else if (opcao == 3)
                System.out.println("Saldo atual: R$ " + saldo);

            else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            }

            else
                System.out.println("Opção inválida!");
        }

        System.out.println("Saldo final: R$ " + saldo);

        entrada.close();
    }
}
