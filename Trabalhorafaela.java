import java.util.Scanner;
public class Trabalhorafaela {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int opcao;

    while (true) {
        System.out.println(" Menu de exercicio " ); 
        System.out.println(" 0 - Sair ");
        System.out.println(" 1 - Exercício 1 " );
        System.out.println(" 2 - Exercício 2 " );
        System.out.println(" 3 - Exercício 3 " );
        System.out.println(" 4 - Exercício 4 " );
        System.out.println(" 5 - Exercício 5 " );
        System.out.println(" 6 - Exercício 6 " );
        System.out.println(" 7 - Exercício 7 " );
        System.out.println(" 8 - Exercício 8 " );
        System.out.println(" 9 - Exercício 9 " );
        System.out.println(" 10 - Exercício 10 " );
        System.out.print(" Escolha uma das opçoes: " );
        opcao = entrada.nextInt();

        //par ou impar
        if (opcao == 1){
            System.out.println("par ou impar " );
            System.out.print("Digite um número inteiro: ");
            int num = entrada.nextInt();
            
            if (num % 2 == 0) 
                System.out.println("Par");
            else 
                System.out.println("Ímpar");
            
            System.out.println("Finalizado");
            
        }

        //maior de dois
        else if (opcao == 2){
        System.out.println(" maior de dois " ); 
     System.out.print("Digite um número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = entrada.nextInt();
        
        if (num1 > num2)
            System.out.println("O maior número é: " +num1);
        else if (num2 > num1) 
            System.out.println("O maior número é: " +num2);
        else
            System.out.println("Os números são iguais");
        
        System.out.println("Finalizado");}

        //calculadora com menu
        else if (opcao == 3){
        System.out.println(" calculadora com menu " );
         System.out.println(" Calculadora " ); 
        System.out.println(" 1 somar + ");
        System.out.println(" 2 subtrair - " );
        System.out.println(" 3 mutiplicar * " );
        System.out.println(" 4 dividir / " );
        System.out.print(" Escolha uma das opçoes: " );
        opcao = entrada.nextInt();

        
        System.out.print( " Digite o primeiro numero: " );
        float num1 = entrada.nextFloat();

        System.out.print( " Digite o segundo numero: " );
        float num2 = entrada.nextFloat();

        if (opcao == 1)
        System.out.println (" Resultado " + (num1+num2));

        else if (opcao ==2)
        System.out.println (" Resultado " + (num1-num2));
        
        else if (opcao ==3)
        System.out.println (" Resultado " + (num1*num2));
        
        else if (opcao ==4)
          if (num2 == 0)
            System.out.println (" Nao existe numero divido por 0 ");
          else
             System.out.println (" Resultado " + (num1/num2));

        else System.out.println (" Opcao invalida ");}

        //validação de entrada
        else if (opcao == 4){
              System.out.println(" validação de entrada " );
              int nota;
                System.out.print("Digite uma nota de entre 0 e 100: ");
        nota = entrada.nextInt();

        while (nota < 0 || nota > 100){
            System.out.println("Nota invalida! digite novamente. ");
            System.out.print("Digite uma nota entre 0 e 100: ");
            nota = entrada.nextInt();

        }
        System.out.println("Nota valida: " + nota );}
        
        // Sentinela (parada no 0)
        else if (opcao == 5){
              System.out.println("  Sentinela (parada no 0) " );
             double numero;
        double maior, menor;

        System.out.print("Digite um número (0 para parar): ");
        numero = entrada.nextDouble();

        if (numero != 0) {
            maior = numero;
            menor = numero;

            while (numero != 0) {

                if (numero > maior)
                    maior = numero;

                if (numero < menor)
                    menor = numero;

                System.out.print("Digite um número (0 para parar): ");
                numero = entrada.nextDouble();
            }

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);

        } else
            System.out.println("Nenhum número válido foi digitado.");}


        // Simulador de caixa
        else if (opcao == 6){
              System.out.println("  Simulador de caixa " );
               double saldo = 1000.0;
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

        System.out.println("Saldo final: R$ " + saldo);}

        // Desconto por categoria
        else if (opcao == 7){
              System.out.println("  Desconto por categoria " );
               double valor, desconto = 0, valorFinal;
        int categoria;

        System.out.print("Digite o valor da compra: ");
        valor = entrada.nextDouble();

        System.out.print("Digite a categoria (1, 2 ou 3): ");
        categoria = entrada.nextInt();

        if (categoria == 1)
            desconto = valor * 0.05;

        else if (categoria == 2)
            desconto = valor * 0.10;

        else if (categoria == 3)
            desconto = valor * 0.15;

        else {
            System.out.println("Categoria inválida.");
            entrada.close();
            return;
        }

        valorFinal = valor - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);}

        //Contagem de valores
        else if (opcao == 8){
              System.out.println(" Contagem de valores " );
              int numero;
        int positivos = 0, negativos = 0, zeros = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite um número: ");
            numero = entrada.nextInt();

            if (numero > 0)
                positivos++;
            else if (numero < 0)
                negativos++;
            else
                zeros++;
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);}

        //Soma de 1 até N
        else if (opcao == 9){
              System.out.println(" Soma de 1 até N " );

               int N, soma = 0;

        System.out.print("Digite um número: ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++)
            soma += i;

        System.out.println("Soma de 1 até " + N + " = " + soma);}

        //Contagem regressiva e soma 
        else if (opcao == 10){
              System.out.println(" Contagem regressiva e soma  " );

               int N, soma = 0;

        System.out.print("Digite um número: ");
        N = entrada.nextInt();

        if (N > 0) {

            for (int i = N; i >= 1; i--) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Soma = " + soma);

        } else
            System.out.println("Digite um número maior que 0!");}


        else if (opcao == 0){
              System.out.println(" 0 sair " );
            break;}

        else System.out.println("opcao invalida ");
        }
    entrada.close();

    }
}
