import java.util.Scanner;

public class DescontoCategoria {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

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
        System.out.println("Valor final: R$ " + valorFinal);

        entrada.close();
    }
}