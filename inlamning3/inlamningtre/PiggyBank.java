package inlamningtre;

/**
 * Class represents a piggybank that stores and tracks
 * their total value in Swedish kronor
 */
public class PiggyBank {

    /** Number of coins saved in the piggybank. */
    private int coinCount;
    /** Total value of the saved coins in Swedish kronor */
    private int sum = 0;

    /**
     * Saves a coin if its value i 1, 2, 5 or 10 Swedish kronor
     * Other values are ignored
     * 
     * @param coinValue the value of the coin in Swedish kronor.
     */
    public void saveCoin(int coinValue) {
        if (coinValue == 1 || coinValue == 2 || coinValue == 5 || coinValue == 10) {
            sum += coinValue;
            coinCount++;
        }

    }

    /**
     * returns the number of saved coins.
     * 
     * @return the number of coins in the piggybank.
     */
    public int getCoinCount() {
        return coinCount;
    }

    /**
     * Returns the total value of the saved coins.
     * 
     * @return the total value in Swedish kronor.
     */

    public int getSum() {
        return sum;
    }
}
