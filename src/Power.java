import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = in.nextInt();
        System.out.print("Enter the exponent : ");
        int exponent = in.nextInt();
        long result =1;
        if(exponent < 0) {
            base = 1/ base ;
            exponent = -exponent;

        }
        for (int i = 1; i <= exponent; i++ ) {
            result *= base;
        }
        System.out.println(result);
    }
}

