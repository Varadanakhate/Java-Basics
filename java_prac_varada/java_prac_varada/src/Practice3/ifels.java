package Practice3;

import java.util.Scanner;

import static Practice3.ifels.getGrade;

public class ifels {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your marks:");
                int marks = sc.nextInt();
                sc.close();

                String grade = getGrade(marks);
                System.out.println("Grade: " + grade);
            }

            public static String getGrade(int marks) {
                int gradeCategory;

                // Determine gradeCategory based on marks
                if (marks >= 75) {
                    gradeCategory = 1; // Distinction
                } else if (marks >= 60) {
                    gradeCategory = 2; // First class
                } else if (marks >= 35) {
                    gradeCategory = 3; // Pass
                } else {
                    gradeCategory = 4; // Fail
                }

                // Use switch statement to determine grade
                String grade;
                switch (gradeCategory) {
                    case 1:
                        grade = "Distinction";
                        break;
                    case 2:
                        grade = "First class";
                        break;
                    case 3:
                        grade = "Pass";
                        break;
                    case 4:
                        grade = "Fail";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + gradeCategory);
                }
                return grade;
            }
        }


