import java.util.*;
public class Battingavg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total_runs = in.nextInt();
        int number_of_dismissals = in.nextInt();
        if(number_of_dismissals==0){
            System.out.println("The player has a perfect batting average (not out yet).");
        } else if (number_of_dismissals <0) {
            System.out.println(total_runs);
        }

    }
}
