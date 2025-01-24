import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse= 0;
        System.out.print("The reverse of " + num + " is: ");
        while(num !=0){
            int digit = num % 10;
            System.out.print(digit);
            reverse= reverse * 10 + 2;
            num /=10;

        }
        System.out.println();
    }
}
