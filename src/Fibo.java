import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a= 0;
        int b= 1;
        if(n >= 1) {
            System.out.print(a + " ");
        } if (n >= 2) {
            System.out.println(b + " ");
        }
        for(int i = 3; i <=n; i++) {
            int next =  a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

    }
}
