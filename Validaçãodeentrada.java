import java.util.Scanner;

public class Validaçãodeentrada {

    public static void main( String [] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.print("Digite uma nota de entre 0 e 100: ");
        nota = entrada.nextInt();

        while (nota < 0 || nota > 100){
            System.out.println("Nota invalida! digite novamente. ");
            System.out.print("Digite uma nota entre 0 e 100: ");
            nota = entrada.nextInt();

        }
        System.out.print("Nota valiada: " + nota );
        entrada.close();
    }
}
