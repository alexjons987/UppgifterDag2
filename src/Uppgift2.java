import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        System.out.println("- Assignment 2: Class grading -");
        Scanner scanner = new Scanner(System.in);

        // Ask for number of attendees
        System.out.print("Enter number of people attending course: ");
        int studentCount = scanner.nextInt();
        String[] studentNamesArr = new String[studentCount];
        int[][] studentGradesArr = new int[studentCount][5];
        String[] studentsNameGradeArr = new String[studentCount]; // Arr used for ranking list
        int passedStudentCount = 0;
        int failedStudentCount = 0;

        // Ask for names and grades of each student
        for (int i = 0; i < studentNamesArr.length; i++) {
            System.out.printf("Name of student #%d: ", i + 1);
            studentNamesArr[i] = scanner.next().trim();
            for (int j = 0; j < studentGradesArr[i].length; j++) {
                System.out.printf("Enter grade #%d for %s: ", j + 1, studentNamesArr[i]);
                studentGradesArr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(); // Newline for pretty printing in console

        // Calculate avg. grade for each student + check if student passed/failed
        for (int i = 0; i < studentNamesArr.length; i++) {
            int totalGradeCount = 0;
            for (int j = 0; j < studentGradesArr[i].length; j++) {
                totalGradeCount += studentGradesArr[i][j];
            }
            float averageGrade = (float) totalGradeCount / 5.0f;

            studentsNameGradeArr[i] = studentNamesArr[i] + "/" + averageGrade;

            if (averageGrade >= 3.0)
                passedStudentCount++;
            else
                failedStudentCount++;

            System.out.printf("%s averaged grade %.2f\n", studentNamesArr[i], averageGrade);
        }

        System.out.println(); // Newline for pretty printing in console

        // Find the _best_ student based on average
        int bestStudentIndex = 0;
        float bestStudentAvg = 0;
        for (int i = 0; i < studentNamesArr.length; i++) {
            int totalGradeCount = 0;
            for (int j = 0; j < studentGradesArr[i].length; j++) {
                totalGradeCount += studentGradesArr[i][j];
            }
            float averageGrade = (float) totalGradeCount / studentGradesArr[i].length;

            if (averageGrade > bestStudentAvg) {
                bestStudentAvg = averageGrade;
                bestStudentIndex = i;
            }
        }
        System.out.printf(
                "%s is the best student! Averaging a grade of %.2f\n",
                studentNamesArr[bestStudentIndex],
                bestStudentAvg
        );

        System.out.printf("%d passed / %d failed students\n", passedStudentCount, failedStudentCount);

        System.out.println(); // Newline for pretty printing in console

        // Sort array containing name + score in "NAME/GRADE" format
        // WARN: Bad habit, do not use arrays for stuff like this, use Classes
        for (int i = 0; i < studentsNameGradeArr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < studentsNameGradeArr.length - i - 1; j++) {
                double gradeA = Double.parseDouble(studentsNameGradeArr[j].split("/")[1]);
                double gradeB = Double.parseDouble(studentsNameGradeArr[j + 1].split("/")[1]);
                if (gradeA < gradeB) {
                    String temp = studentsNameGradeArr[j];
                    studentsNameGradeArr[j] = studentsNameGradeArr[j + 1];
                    studentsNameGradeArr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        // Print rankings best to worst
        int rank = 1;
        System.out.println("Full student list (best to worse):");
        for (String str : studentsNameGradeArr) {
            String[] nameGrade = str.split("/");
            String name = nameGrade[0];
            String averageGrade = nameGrade[1];
            System.out.printf("%d. %.2f %s\n", rank, Double.parseDouble(averageGrade), name);
            rank++;
        }
    }
}
