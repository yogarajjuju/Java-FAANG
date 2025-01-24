import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pls Enter temperature in C");
        float tempc = in.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);


    }
}
