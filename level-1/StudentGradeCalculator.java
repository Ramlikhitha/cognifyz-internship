import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subject grades : ");
        int numberOfGrades = scanner.nextInt();

        int total = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            total += grade;
        }

        double averageGrade = (double) total / numberOfGrades;
        System.out.printf("The average grade is: %.2f%n", averageGrade);
        String grade=calculateGrade(averageGrade);
        System.out.printf("Grade:"+grade);
        scanner.close();
    }
    public static String calculateGrade(double percentage)
    {
        if(percentage>=90)
        {
            return "A+";
        }
        else if(percentage>=80)
        {
            return "A";
        }
        else if(percentage>=70)
        {
            return "B";
        }
        else if(percentage>=60)
        {
            return "C";
        }
        else if(percentage>=50)
        {
            return "D";
        }
        else 
        {
            return "F";
        }
    }

}