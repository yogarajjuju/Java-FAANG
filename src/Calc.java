import java.util.*;
class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char op = in.next().charAt(0);
        if(op =='+'){
            System.out.println(a + b );
        } else if(op == '-') {
            System.out.println(a - b);
        } else if(op == '*'){
            System.out.println(a * b);
        } else {
            System.out.println(a /  b);
        }
    }
}