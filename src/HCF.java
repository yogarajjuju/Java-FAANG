import java.util.Scanner;

public class HCF {
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
