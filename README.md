# Student Report Card Generator

## Project Overview

The *Student Report Card Generator* is a Java-based application designed to automate the process of generating academic report cards. By inputting student details and marks, the application calculates the total marks, percentage, grade, and pass/fail status, generating a well-formatted report card. This project aims to reduce manual calculations and errors, streamlining the process for educational institutions.

The system is designed with core Java principles, such as object-oriented programming (OOP), error handling, and file management, and offers a command-line interface (CLI) for user interaction. Additionally, it incorporates error handling and modular design for future extensibility.

## Features

### Core Features:
- *Student Information Input*: Allows input of student name, roll number, and class.
- *Marks Entry*: Enables entry of subject-wise marks.
- *Total Marks and Percentage Calculation*: Automatically computes total marks and percentage.
- *Grade Assignment*: Dynamically assigns grades based on the percentage.
- *Pass/Fail Status*: Displays whether the student has passed or failed.
- *Report Card Generation*: Outputs a formatted report card to the console.

### Additional Features:
- *Input Validation*: Ensures that marks entered are within the valid range (0-100).
- *File Handling*: Optionally saves the report card as a text file for easy printing and record-keeping.
- *Extensibility*: Modular structure allowing easy addition of features like subject customization or a graphical user interface (GUI).

## Technologies Used
- *Java* (JDK 8 or higher)
- *Text Editor/IDE* (e.g., VS Code, IntelliJ IDEA, Eclipse)
- *Command Line Interface (CLI)*

## Code Structure

The code is divided into separate classes to manage different aspects of the report card generation process:

1. *Student Class*: Handles student information, marks, and grade calculation.
2. *Input Module*: Manages user input for student details and marks.
3. *Processing Module*: Calculates total marks, percentage, and assigns grades.
4. *Output Module*: Displays the report card to the user.
5. *ReportCardGenerator Class*: Main class coordinating the flow of the application.

### Example of Code Structure:

```java
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
        // Input student details
    }

    void inputMarks(Scanner sc, int subjects) {
        // Input subject marks and calculate total
    }

    void calculateGrade() {
        // Assign grade based on percentage
    }

    void printReport() {
        // Print the report card
    }
}

public class ReportCardGenerator {
    public static void main(String[] args) {
        // Main method to run the application
    }
}
