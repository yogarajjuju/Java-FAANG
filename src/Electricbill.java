import java.util.*;
public class Electricbill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Current meter reading ");
        int current_input = in.nextInt();
        System.out.println("Enter Previous meter reading");
        int previous_input = in.nextInt();
        System.out.println("Enter Fixed charges");
        int fixed_charge = in.nextInt();
        System.out.println("Enter the number of traiff slabs");
        int traiff_slabs = in.nextInt();
        int total_units = current_input - previous_input;
        int bill_amount = 0;
        int remaining_units = total_units;
        for (int i = 1; i <= traiff_slabs ; i++) {
            System.out.print("Enter the units for slab" + i + "(Enter -1 for no limit):");
            int slabs_limit = in.nextInt();
            System.out.println("Enter the rate per unit for slab" + i + ":");
            int rate = in.nextInt();
            if(slabs_limit == -1 || remaining_units <= slabs_limit){
                bill_amount = bill_amount + (remaining_units * rate);
                remaining_units = 0;
                break;
            } else {
                bill_amount = bill_amount + (slabs_limit * rate);
                remaining_units = remaining_units - slabs_limit;
            }

        }
        bill_amount =  bill_amount + fixed_charge;
        System.out.println("Total units consumed:" + total_units);
        System.out.println("Total electricity bill amount:" + bill_amount);
    }
}
