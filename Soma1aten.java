import java.util.Scanner;

public class Soma1aten{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N, soma = 0;

        System.out.print("Digite um número: ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++)
            soma += i;

        System.out.println("Soma de 1 até " + N + " = " + soma);

        entrada.close();
    }
}
