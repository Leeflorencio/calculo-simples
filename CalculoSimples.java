import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        //Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        // o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        // Após, calcule e mostre o valor a ser pago.

        Scanner sc = new Scanner(System.in);
        DecimalFormat result = new DecimalFormat("0.00");

        System.out.println("Digite o código da peça1, o número de peças, e o valor unitário: ");
        Integer codigoPeça1 = sc.nextInt(); Integer numPeça1 = sc.nextInt(); Double valorUni = sc.nextDouble();

        System.out.println("Digite o código da peça2, o número de peças, e o valor unitário: ");
        Integer codigoPeça2 = sc.nextInt(); Integer numPeça2 = sc.nextInt(); Double valorUni2 = sc.nextDouble();

        Double totalPeças1 = numPeça1 * valorUni;
        Double totalPeças2 = numPeça2 * valorUni2;

        Double valorTotal = totalPeças1 + totalPeças2;

        System.out.println("VALOR A PAGAR: R$ " + result.format(valorTotal));
    }
}
