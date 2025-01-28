import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int originalnum = num;
        int numdigits = 0;
        while(num > 0) {
            num /= 10;
            numdigits++;
        }
        int sum = 0;
        num = originalnum;
        while(num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numdigits);
            num /= 10;
        }
        if(sum == originalnum){
            System.out.println(originalnum+ " is an Armstrong number.");
        }
        else {
            System.out.println(originalnum+ " is  no an Armstrong number.");
        }

    }
}
