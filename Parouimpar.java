import java.util.Scanner;

public class Parouimpar {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        
        if (num % 2 == 0) 
            System.out.println("Par");
         else 
            System.out.println("Ímpar");
        
        System.out.println("Finalizado");
         entrada.close();
	}
}     