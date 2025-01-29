import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = in.nextInt();
        int sum = 0;
        while(num>0) {
            int digit = num % 10;//get last digit
            sum += digit;// add its
            num/=10;//removes the last digit

        }
        System.out.println(sum);
    }
}
