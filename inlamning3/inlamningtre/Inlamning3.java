package inlamningtre;

import java.util.Scanner;

/**
 * Lets the user save coins in a piggybank and
 * display the number of saved coins and their total value.
 */

public class Inlamning3 {

    /**
     * Reads coin values until the user enters 0, then displays
     * the number of saved coins and their total value.
     */
    public static void main() {

        // Create a piggybank and a scanner for user input.

        PiggyBank piggyBank = new PiggyBank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vilket mynt vill du spara?");
        int p = scanner.nextInt();

        // Keeps accepting coin values until user enters 0.

        while (p != 0) {
            piggyBank.saveCoin(p);
            System.out.println("Vilket mynt vill du spara? ");
            p = scanner.nextInt();
        }
        // Display the number of saved coins and their total value.
        System.out.printf("Du har sparat %d mynt till ett totalt värde av %d kronor. %n", piggyBank.getCoinCount(),
                piggyBank.getSum());

        scanner.close();
    }
}
