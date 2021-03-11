//import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        /* Scanner in = new Scanner(System.in);
        System.out.print("Input a cartTotal: ");
        int cartTotal2 = in.nextInt(); */

        //1000 deneg skidka 15%
        int cartTotal = 1010;//summa tovara
        //cartTotal = cartTotal2;
        double totalToPay; //k oplate

        if (cartTotal > 500 && cartTotal < 1000 ) {
            totalToPay = cartTotal * 0.9;
            System.out.println("Discount 10 proz was used");
        }
        else
            if (cartTotal > 1000) {
            totalToPay = cartTotal * 0.85;
            System.out.println("Skidka 15 proz");
        }
            else {
            totalToPay = cartTotal;
            System.out.println("No skidok");
        }

        System.out.println("Your total " + totalToPay);
    }
}


