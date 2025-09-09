import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        System.out.println("- Assignment 2: Class grading -");
        Scanner scanner = new Scanner(System.in);

        // Ask for number of attendees
        System.out.print("Enter number of people attending course: ");
        int studentCount = scanner.nextInt();
        String[] studentNameArr = new String[studentCount];
        int[][] studentGradeArr = new int[studentCount][5];
        int passedStudentCount = 0;
        int failedStudentCount = 0;

        // Ask for names and grades of each student
        for (int i = 0; i < studentNameArr.length; i++) {
            System.out.printf("Name of student #%d: ", i + 1);
            studentNameArr[i] = scanner.next().trim();
            for (int j = 0; j < studentGradeArr[i].length; j++) {
                System.out.printf("Enter grade #%d for %s: ", j + 1, studentNameArr[i]);
                studentGradeArr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(); // Newline for pretty printing in console

        // Calculate avg. grade for each student + check if student passed/failed
        for (int i = 0; i < studentNameArr.length; i++) {
            int totalGradeCount = 0;
            for (int j = 0; j < studentGradeArr[i].length; j++) {
                totalGradeCount += studentGradeArr[i][j];
            }
            float averageGrade = (float) totalGradeCount / 5.0f;

            if (averageGrade >= 3.0)
                passedStudentCount++;
            else
                failedStudentCount++;

            System.out.printf("%s averaged grade %.2f\n", studentNameArr[i], averageGrade);
        }

        System.out.println(); // Newline for pretty printing in console

        // Find the _best_ student based on average
        int bestStudentIndex = 0;
        float bestStudentAvg = 0;
        for (int i = 0; i < studentNameArr.length; i++) {
            int totalGradeCount = 0;
            for (int j = 0; j < studentGradeArr[i].length; j++) {
                totalGradeCount += studentGradeArr[i][j];
            }
            float averageGrade = (float) totalGradeCount / studentGradeArr[i].length;

            if (averageGrade > bestStudentAvg) {
                bestStudentAvg = averageGrade;
                bestStudentIndex = i;
            }
        }
        System.out.printf(
                "%s is the best student! Averaging a grade of %.2f\n",
                studentNameArr[bestStudentIndex],
                bestStudentAvg
        );

        System.out.printf("%d passed / %d failed students\n", passedStudentCount, failedStudentCount);

        System.out.println(); // Newline for pretty printing in console

        // Show a list ranking best - worst student
    }
}
