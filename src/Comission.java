import java.util.*;
public class Comission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sales amount");
        double sales = in.nextDouble();
        System.out.println("Enter the commission earned");
        double commission_earn = in.nextDouble();
        double commission_per = (commission_earn/ sales) *100;
        System.out.println(commission_per);

    }
}