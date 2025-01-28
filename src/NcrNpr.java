import java.util.Scanner;

public class NcrNpr {
    public static  long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
            
        }
        return result;

    }
    public static  long nCr(int n, int r) {
        return  factorial(n) / (factorial(r) * factorial(n - r) );
    }
    public static  long nPr(int n, int r) {
        return  factorial(n) /  factorial(n - r) ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = in.nextInt();
        System.out.println("Enter the value of R");
        int r = in.nextInt();
        System.out.println("NCR (combination) = " + nCr(n,r));
        System.out.println("NPR (combination) = " + nPr(n,r));
    }
}
