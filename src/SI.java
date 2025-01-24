import java.util.*;
public class SI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();
        int T = in.nextInt();
        int R = in.nextInt();
        int SI = (P * T * R)/100;
        System.out.println("The Simple interest is : " + SI);
    }

}
