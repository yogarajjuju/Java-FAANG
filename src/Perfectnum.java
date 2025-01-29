import java.util.Scanner;

public class Perfectnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum_divisor = 0;
        for (int i = 1; i <n ; i++) {
            if(n % i ==0){
                sum_divisor += i;
            }



        }  if(sum_divisor==n){
            System.out.println("Perfect");

        } else {
            System.out.println("Not Perfect");
        }


    }
}
