import java.util.*;
public class Dist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y1 = in.nextDouble();
        double y2 = in.nextDouble();
        double d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1 , 2));
        System.out.println(d);
    }
}
