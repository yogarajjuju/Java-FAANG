import java.util.Scanner;

public class SUMN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of numbers");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number " + i + ":");
            int num = in.nextInt();
            sum+= num;


        }
        System.out.println(sum);
    }
}
