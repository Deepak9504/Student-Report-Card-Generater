import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String className;
    int[] marks;
    int total = 0;
    double percentage;
    String grade;
    boolean isPass = true;

    void inputDetails(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Class: ");
        className = sc.nextLine();
    }

    void inputMarks(Scanner sc, int subjects) {
        marks = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            int mark = -1;
            while (mark < 0 || mark > 100) {
                try {
                    System.out.print("Enter marks for Subject " + (i + 1) + " (0-100): ");
                    mark = Integer.parseInt(sc.nextLine());
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid input. Please enter marks between 0 and 100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numeric value.");
                }
            }
            marks[i] = mark;
            total += mark;

            if (mark < 35) {
                isPass = false;
            }
        }

        percentage = total / (double) subjects;
        calculateGrade();
    }

    void calculateGrade() {
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F";
    }

    void printReport() {
        System.out.println("\n--- Report Card ---");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNumber);
        System.out.println("Class     : " + className);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total     : " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade     : " + grade);
        System.out.println("Result    : " + (isPass ? "Pass" : "Fail"));
    }
}

public class ReportCardGenerator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Student s = new Student();
            s.inputDetails(sc);

            System.out.print("Enter number of subjects: ");
            int subjectCount = Integer.parseInt(sc.nextLine());

            s.inputMarks(sc, subjectCount);
            s.printReport();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
}
}