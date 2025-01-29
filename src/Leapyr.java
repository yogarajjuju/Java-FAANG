import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = in.nextInt();
        if(n% 400 ==0) {
            System.out.println("Leap Year");
        } else if (n % 100 ==0) {
            System.out.println("Not Leap Year");

        } else if (n % 4 == 0) {
            System.out.println("Leap Year");

        } else {
            System.out.println("not");
        }
    }
}
/* import java.util.Scanner;
(optimized way)
public class Leapyr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = in.nextInt();

        // Ternary operator for compact logic
        String result = (n % 400 == 0) ? "Leap Year" :
                        (n % 100 == 0) ? "Not a Leap Year" :
                        (n % 4 == 0) ? "Leap Year" : "Not a Leap Year";

        System.out.println(result);
    }
}
*/