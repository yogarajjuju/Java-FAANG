import java.util.Scanner;

public class FIV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the present value");
        double pv = in.nextDouble();
        System.out.println("Enter Annual Interest rate ");
        double r = in.nextDouble()/100;
        System.out.println("Enter Number of Times Interest is Compounded per Year (n): ");
        int n = in.nextInt();
        System.out.println("Enter Number of years");
        int t = in.nextInt();
        double base = 1 + (r / n);
        int exponent = n * t;
        double power = 1;
        for (int i = 0; i < exponent; i++) {
            power *= base;
        }
        double FV = pv * power;
        System.out.println("Future Investment Value: " + FV);
    }
}
