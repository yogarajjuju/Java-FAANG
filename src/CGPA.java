import java.util.*;
public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of subjects");
        int num_sub = in.nextInt();
        double total_grade_points = 0;
        double total_credit_hours = 0;
        for (int i = 1; i <= num_sub; i++) {
            System.out.println("Enter grade point for subject " + i + ":");
            double grade_point = in.nextDouble();
            System.out.println("Enter credit hours for subject " + i + ":");
            double credit_hours = in.nextDouble();
            total_grade_points += grade_point * credit_hours;
            total_credit_hours += credit_hours;

        }
        if (total_credit_hours > 0) {
            double cgpa = total_grade_points / total_credit_hours;
            System.out.printf("The CGPA is: %.2f%n", cgpa);
        } else {
            System.out.println("No credit hours entered, cannot calculate CGPA.");
        }
    }
}
