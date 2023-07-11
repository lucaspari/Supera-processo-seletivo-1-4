package segundodesafio;

import java.math.BigDecimal;
import java.util.Scanner;

public class Desafio {
    public static void desafio() {
        int[] bills = { 100, 50, 20, 10, 5, 2 };
        BigDecimal[] coins = {
                new BigDecimal("1.00"),
                new BigDecimal("0.50"),
                new BigDecimal("0.25"),
                new BigDecimal("0.10"),
                new BigDecimal("0.05"),
                new BigDecimal("0.01")
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor: ");
        BigDecimal value = input.nextBigDecimal();
        int c = 0;
        int[] billCounts = new int[bills.length];
        while (value.compareTo(new BigDecimal("2")) >= 0) {
            if (value.compareTo(new BigDecimal(bills[c])) >= 0) {
                billCounts[c]++;
                value = value.subtract(new BigDecimal(bills[c]));
            } else {
                c++;
            }
        }

        c = 0;
        int[] coinCounts = new int[coins.length];
        while (value.compareTo(BigDecimal.ZERO) > 0) {
            if (value.compareTo(coins[c]) >= 0) {
                coinCounts[c]++;
                value = value.subtract(coins[c]);
            } else {
                c++;
            }
        }

        input.close();

        System.out.println("NOTAS:");
        for (int i = 0; i < bills.length; i++) {
            System.out.println(billCounts[i] + " nota(s) de R$ " + bills[i] + ".00");
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coinCounts[i] + " moeda(s) de R$ " + coins[i]);
        }
    }

    public static void main(String[] args) {
        desafio();
    }
}
