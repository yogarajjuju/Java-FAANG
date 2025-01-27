import java.util.*;
public class CompountInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal amount");
        double p = in.nextDouble();
        System.out.println("Enter the annual rate ");
        double r = in.nextDouble() / 100;
        System.out.println("Enter Number of times interest is compounded per year");
        double n = in.nextDouble();
        System.out.println("Enter the time the money is invested or borrowed ");
        double t = in.nextDouble();
        double A = p * Math.pow((1 + r / n), n * t);
        double ci = A - p ;
        System.out.printf("Compound Interest: %.2f\n", ci);
        System.out.printf("Future Value (Amount): %.2f\n", A);
    }
}
