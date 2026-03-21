import java.util.Scanner;

public class Regressivaesoma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

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
            System.out.println("Digite um número maior que 0!");

        entrada.close();
    }
}