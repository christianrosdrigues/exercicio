import java.util.Scanner;

public class Contagemvalores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

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
        System.out.println("Zeros: " + zeros);

        entrada.close();
    }
}
