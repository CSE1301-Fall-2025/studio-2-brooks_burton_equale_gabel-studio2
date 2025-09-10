 import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println ("What is your start amount:");
       double Startamount = in.nextDouble();
        System.out.println ("What is your win chance:");
       double Winchance = in.nextDouble();
       System.out.println ("What is your win limit:");
       int Winlimit = in.nextInt();
        int Daynumber = 1;
        int betNumber = 1;
for (int loopNumber = 1; loopNumber < 5; ++loopNumber) {
        while ((Startamount < Winlimit) && (Startamount > 0)) {
            int moneyWon = (int) (Math.random() + Winchance);
            if (moneyWon == 1) {
                Startamount = Startamount + 1;
            } else {
                Startamount = Startamount - 1;
            }
            System.out.println( "Bet number: " + betNumber + " $" + Startamount);
            ++betNumber;
        }
            if (Startamount > 0) {
                System.out.println(" WIN.");
            } else {
                System.out.println(" LOSE.");
            }

           System.out.println("Day number: " + Daynumber);
           Winlimit = Winlimit + 10;
           Daynumber=Daynumber+1;
        }
           
    }
}
