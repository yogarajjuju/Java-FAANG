import javax.xml.transform.Source;
import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            System.out.print("Enter the number " + i + ":");
            int num = in.nextInt();
            sum = sum + num;

            
        }
        double avg = sum / n;
        System.out.println("The average of the " + n + " numbers is: " + avg);
    }
}
