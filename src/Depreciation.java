import java.util.*;
public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Cost value");
       double cost = in.nextDouble();
        System.out.println("Enter Salvage Value");
        double salvage_value = in.nextDouble();
        System.out.println("Enter useful life");
        double useful_life = in.nextDouble();
        double Depreciation = (cost - salvage_value) / useful_life;
        System.out.println(Depreciation);
    }
}
