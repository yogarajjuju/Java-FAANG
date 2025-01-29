import java.util.Scanner;

public class Vowelsorconst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = in.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (Character.isLetter(ch)) {
            if(ch == 'a' || ch =='e' || ch == 'i' || ch =='o' || ch=='u') {
                System.out.println("Vowels");
            } else {
                System.out.println("Consonant");
            }

        }
        else {

            System.out.println("Invalid input. Please enter an alphabetic character.");
        }
    }
}
