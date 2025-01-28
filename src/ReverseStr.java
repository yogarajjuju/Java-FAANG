import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str =in.next();
        String reverse = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            reverse += str.charAt(i);

            
        }
        System.out.println("Reversed String: " + reverse);

    }
}
