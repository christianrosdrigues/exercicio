import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Calculadora " ); 
        System.out.println(" 1 somar + ");
        System.out.println(" 2 subtrair - " );
        System.out.println(" 3 mutiplicar * " );
        System.out.println(" 4 dividir / " );
        System.out.print(" Escolha uma das opçoes: " );
        int opcao = entrada.nextInt();

        
        System.out.println( " Digite o primeiro numero: " );
        float num1 = entrada.nextFloat();

        System.out.println( " Digite o segundo numero: " );
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

        else System.out.println (" Opcao invalida ");
         
        entrada.close();
    
    }
}