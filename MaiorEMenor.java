import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

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
            System.out.println("Nenhum número válido foi digitado.");

        entrada.close();
    }
}