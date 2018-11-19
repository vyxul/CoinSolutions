import java.util.Arrays;

public class CoinSolutions {
    public static void main(String[] args) {
        final double finalSum = 0.88;
        double coins[] = new double[4];
        int solutions = 0;
        double quarters, dimes, nickels, pennies;
        System.out.println("This program tests all the possible ways you can get $0.88 with different coins");
        System.out.println();
        
        for (quarters = 0; quarters <= (finalSum / .25); quarters++) {
            coins[0] = quarters;

            for (dimes = 0; dimes <= (finalSum / .10); dimes++) {
                coins[1] = dimes;

                for (nickels = 0; nickels <= (finalSum / .05); nickels++) {
                    coins[2] = nickels;

                    for (pennies = 0; pennies <= (finalSum / .01); pennies++) {
                        coins[3] = pennies;
                        if (coinSum(coins) == finalSum) {
                            solutions++;
                            System.out.printf("%.0f Quarters + %.0f Dimes + %.0f Nickels + %.0f Pennies = $%.2f\n", 
                                coins[0], coins[1], coins[2], coins[3], coinSum(coins));
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.printf("There are a total of %d possible solutions.\n", solutions);
    }

    static double coinSum(double array[]) {;
        return ((array[0] * .25) + (array[1] * .10) + (array[2] * .05) + (array[3] * .01));
    }
}
