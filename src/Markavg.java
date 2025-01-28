import java.util.Scanner;

public class Markavg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int numsubjets = in.nextInt();
        int total_marks = 0;
        for (int i = 1; i <= numsubjets ; i++) {
            System.out.print("Enter the mark for the subject " + i + ":");
            int marks = in.nextInt();
            total_marks += marks;

            
        }
        double avg =  (double)total_marks/numsubjets;
        System.out.println("The average is " + avg);
    }
}
