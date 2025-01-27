import java.util.*;
public class Sample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number or (enter 0 to exit)");
        int num = in.nextInt();
        while(true) {
            if(num == 0) {
                break;

            }
            sum += num;
        }
        System.out.println(sum);
    }
}
