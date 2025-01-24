import java.util.*;
public class Palindromm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A string");
        String str = in.nextLine();
        str = str.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("This is a palindrome");
        }
        else {
            System.out.println("This is not a palindrome");
        }
    }
}
