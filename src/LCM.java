import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2");
        int num2 = in.nextInt();
        int hcf = 0;
//        int small = Math.min(num1,num2);
//        (num1 < num2 ? num1 : num2) without inbuilt function
        for (int i = (num1 < num2 ? num1 : num2); i > 0; i--){
            if (num1 % i ==0 && num2 % i == 0){
                hcf = i;
                System.out.println("HCF is  " + i);
                break;

            }


        }
        int LCM = (num1 * num2) / hcf;
        System.out.println( " The LCM is :" + LCM);



    }
}
/*import java.util.Scanner;
(Without HCF)
public class LCMWithoutHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2");
        int num2 = in.nextInt();

        // Find the larger number to start with
        int larger = (num1 > num2) ? num1 : num2;

        // Start generating multiples of the larger number
        int lcm = larger;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break; // First multiple divisible by both numbers is LCM
            }
            lcm += larger; // Generate the next multiple
        }

        System.out.println("LCM is: " + lcm);
    }
}
*/