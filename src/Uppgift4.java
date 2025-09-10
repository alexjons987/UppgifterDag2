import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        System.out.println("- Assignment 4: Shopping list -");
        Scanner scanner = new Scanner(System.in);

        double[] expensesArr = new double[7];
        String currency = "SEK";

        // Ask how many items are being bought
        int itemCount;
        do {
            System.out.print("Enter items to buy (max 10): ");
        } while ((itemCount = scanner.nextInt()) > 10);

        String[] items = new String[itemCount];
        double[] prices = new double[itemCount];

        // Ask for items + price for each item
        for (int i = 0; i < items.length; i++) {
            System.out.printf("Item #%d: ", i + 1);
            items[i] = scanner.next();
            System.out.printf("Item #%d price: ", i + 1);
            prices[i] = scanner.nextDouble();
        }

        // Calculate total price
        double totalPrice = 0;
        for (double price : prices)
            totalPrice += price;
        System.out.printf("Total price of shopping list is %.2f %s\n", totalPrice, currency);

        System.out.println(); // Newline for pretty printing in console

        // Find most expensive item
        int mostExpensiveItemIndex = 0; // Assume first item in arr is most expensive
        double mostExpensiveItemPrice = prices[0];
        for (int i = 1; i < prices.length; i++)
            if (prices[i] > mostExpensiveItemPrice) {
                mostExpensiveItemIndex = i;
                mostExpensiveItemPrice = prices[i];
            }
        System.out.printf(
                "Most expensive item on the shopping list is %s with a price of %.2f %s\n",
                items[mostExpensiveItemIndex],
                totalPrice,
                currency
        );

        System.out.println(); // Newline for pretty printing in console

        // Print entire shopping list
        System.out.println("Entire shopping list:");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %s %.2f :-\n", i + 1, items[i], prices[i]);
        }
    }
}
