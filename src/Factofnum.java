import java.util.*;
public class Factofnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number");
        int number = in.nextInt();
        System.out.println("Factors of " + number + " are: ");
        for(int i  = 1; i<= number; i++ ){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
