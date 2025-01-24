import java.util.*;
public class INRtoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double INR = in.nextDouble();
        double conversionrate = 75;
        double USD = INR / conversionrate;
        System.out.println("The USD is : " + USD);
    }
}
