import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks in subject 1:");
        int m1 = scanner.nextInt();

        System.out.println("Enter marks in subject 2:");
        int m2 = scanner.nextInt();

        System.out.println("Enter marks in subject 3:");
        int m3 = scanner.nextInt();

        int totalMarks = m1 + m2 + m3;
        double averagePercentage = (totalMarks / 3.0);

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}