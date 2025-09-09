import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        System.out.println("- Assignment 1: Temperature analysis -");
        Scanner scanner = new Scanner(System.in);

        // Create suitable arrays for weekdays and temperatures for a week
        double[] weeklyTemp = new double[7];
        String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        double avgTemp = 0;
        double totalTemp = 0;

        // Read temperatures from user input + calculate and show avg. temp
        for (int i = 0; i < weekdays.length; i++) {
            System.out.printf("Write the temp for %s: ", weekdays[i]);
            double temp = scanner.nextDouble();
            weeklyTemp[i] = temp;
            totalTemp += temp;
        }
        avgTemp = totalTemp / 7;
        System.out.printf("The avg. temp. this week was: %.2f°C\n", avgTemp);

        // Get the highest temp
        double highestTemp = weeklyTemp[0]; // Assume first is highest
        int weekdayHighestTempIndex = 0;
        for (int i = 1; i < weeklyTemp.length; i++)
            if (weeklyTemp[i] > highestTemp) {
                highestTemp = weeklyTemp[i];
                weekdayHighestTempIndex = i;
            }
        System.out.printf("The highest temperature was %.2f°C on %s\n", highestTemp, weekdays[weekdayHighestTempIndex]);

        // Get the lowest temp
        double lowestTemp = weeklyTemp[0]; // Assume first is lowest
        int weekdayLowestTempIndex = 0;
        for (int i = 1; i < weeklyTemp.length; i++)
            if (weeklyTemp[i] < lowestTemp) {
                lowestTemp = weeklyTemp[i];
                weekdayLowestTempIndex = i;
            }
        System.out.printf("The lowest temperature was %.2f°C on %s\n", lowestTemp, weekdays[weekdayLowestTempIndex]);

        // Check amount of days over 20°C
        int daysOverTwentyCelsius = 0;
        for (double temp : weeklyTemp)
            if (temp > 20.0f)
                daysOverTwentyCelsius++;
        System.out.printf("There were %d day(s) over 20°C!\n", daysOverTwentyCelsius);

        // Show all temperatures of the week in a foreach-loop ("enhanced for-loop")
        System.out.print("Temperatures this week: ");
        for (double temp : weeklyTemp)
            System.out.printf("%.2f°C ", temp);
        System.out.println();

        // Show graph using asterisks
        System.out.println("Asterisk graph of weekly temperatures:");
        for (int i = 0; i < weekdays.length; i++) {
            int astCount = (int) weeklyTemp[i] / 2;
            for (int j = 0; j < astCount; j++)
                System.out.print("*");
            System.out.printf(" - %.2f°C %s\n", weeklyTemp[i], weekdays[i]);
        }
    }
}
