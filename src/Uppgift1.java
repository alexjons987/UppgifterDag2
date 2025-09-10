import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        System.out.println("- Assignment 1: Temperature analysis -");
        Scanner scanner = new Scanner(System.in);

        // Create suitable arrays for weekdays and temperatures for a week
        double[] temperatures = new double[7];
        String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        double avgTemp = 0;
        double totalTemp = 0;

        // Read temperatures from user input + calculate and show avg. temp
        for (int i = 0; i < weekdays.length; i++) {
            System.out.printf("Write the temp for %s: ", weekdays[i]);
            double temp = scanner.nextDouble();
            temperatures[i] = temp;
            totalTemp += temp;
        }
        avgTemp = totalTemp / 7;
        System.out.printf("The avg. temp. this week was: %.2f°C\n", avgTemp);

        // Get the highest temp
        double highestTemp = temperatures[0]; // Assume first is highest
        int weekdayHighestTempIndex = 0;
        for (int i = 1; i < temperatures.length; i++)
            if (temperatures[i] > highestTemp) {
                highestTemp = temperatures[i];
                weekdayHighestTempIndex = i;
            }
        System.out.printf("The highest temperature was %.2f°C on %s\n", highestTemp, weekdays[weekdayHighestTempIndex]);

        // Get the lowest temp
        double lowestTemp = temperatures[0]; // Assume first is lowest
        int weekdayLowestTempIndex = 0;
        for (int i = 1; i < temperatures.length; i++)
            if (temperatures[i] < lowestTemp) {
                lowestTemp = temperatures[i];
                weekdayLowestTempIndex = i;
            }
        System.out.printf("The lowest temperature was %.2f°C on %s\n", lowestTemp, weekdays[weekdayLowestTempIndex]);

        // Check amount of days over 20°C
        int daysOverTwentyCelsius = 0;
        for (double temp : temperatures)
            if (temp > 20.0f)
                daysOverTwentyCelsius++;
        System.out.printf("There were %d day(s) over 20°C!\n", daysOverTwentyCelsius);

        // Show all temperatures of the week in a foreach-loop ("enhanced for-loop")
        System.out.print("Temperatures this week: ");
        for (double temp : temperatures)
            System.out.printf("%.2f°C ", temp);
        System.out.println();

        // Show graph using asterisks
        System.out.println("Asterisk graph of weekly temperatures:");
        for (int i = 0; i < weekdays.length; i++) {
            int astCount = (int) temperatures[i] / 2; // Integer division rounds down
            for (int j = 0; j < astCount; j++) // Print asterisks based on height
                System.out.print("*");
            System.out.printf(" - %.2f°C %s\n", temperatures[i], weekdays[i]); // <asterisk> - <temp>°C <day>
        }
    }
}
