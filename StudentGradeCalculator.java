//import java.util.Scanner;
//
//public class StudentGradeCalculator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input
//        System.out.print("Enter number of subjects: ");
//        int n = sc.nextInt();
//        double total = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter marks for subject " + i + ": ");
//            double marks = sc.nextDouble();
//            total += marks;
//        }
//
//        // Calculations
//        double average = total / n;
//        String grade;
//
//        if (average >= 90) {
//            grade = "A+";
//        } else if (average >= 80) {
//            grade = "A";
//        } else if (average >= 70) {
//            grade = "B";
//        } else if (average >= 60) {
//            grade = "C";
//        } else if (average >= 50) {
//            grade = "D";
//        } else {
//            grade = "F";
//        }
//
//        // Output
//        System.out.println("\nTotal Marks: " + total);
//        System.out.println("Average Percentage: " + average + "%");
//        System.out.println("Grade: " + grade);
//
//        sc.close();
//    }
//}
