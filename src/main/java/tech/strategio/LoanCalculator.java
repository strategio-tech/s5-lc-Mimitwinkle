package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {
    /**
     * This method receives a total loan amount ("amount") as a parameter,
     * then calculates how much will still be owed after 3 months
     * if 10% is paid each month. The result of these calculations
     * is returned ("amount").
     *
     * @param amount the total loan amount before calculations
     * @return       the remaining loan amount after 3 months of 10% payments
     */
    static int getRemainingAmountIn3Months(int amount) {
        for(int i=0; i < 3; i++){
            int payment = (amount * 10) / 100;
            int remaining = amount - payment;
            amount = remaining;
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
