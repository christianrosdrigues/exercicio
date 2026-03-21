import java.util.Scanner;

public class Maiordedois {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

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
        
        System.out.println("Finalizado");
         entrada.close();
	}
}     