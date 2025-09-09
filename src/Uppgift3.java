import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        System.out.println("- Assignment 3: Weekly bill -");
        Scanner scanner = new Scanner(System.in);

        double[] expensesArr = new double[7];
        String currency = "SEK";

        // Ask for expenses
        for (int i = 0; i < expensesArr.length; i++) {
            System.out.printf("Enter expenses of day #%d: ", i + 1);
            expensesArr[i] = scanner.nextDouble();
        }

        System.out.println(); // Newline for pretty printing in console

        // Total expenses
        double totalExpenses = 0;
        for (double expense : expensesArr)
            totalExpenses += expense;
        System.out.printf("Total expenses this week: %.2f %s\n", totalExpenses, currency);

        // Most expensive day
        int mostExpensiveDayIndex = 0; // Assume first day is the most expensive day
        double mostExpensiveDayExpense = expensesArr[0];
        for (int i = 1; i < expensesArr.length; i++)
            if (expensesArr[i] > mostExpensiveDayExpense) {
                mostExpensiveDayIndex = i;
                mostExpensiveDayExpense = expensesArr[i];
            }
        System.out.printf(
                "Most expensive day was day #%d with total expenses of %.2f %s\n",
                mostExpensiveDayIndex,
                mostExpensiveDayExpense,
                currency
        );

        // Days over 100 SEK
        int daysOverOneHundredSEK = 0;
        for (double expense : expensesArr)
            if (expense > 100)
                daysOverOneHundredSEK++;
        System.out.printf("Days over 100 %s: %d\n", currency, daysOverOneHundredSEK);
    }
}
