/**
 * Created by admin on 2017-05-21.
 */
public class new1 {
    public static void main(String[] args) {

        String myName = ("Zbigniew") ;

        double eurCash = 300 ;
        double usdCash = 200 ;
        double plnCash = 400 ;

        double eurPln = 4.20 ;
        double usdPln = 3.80 ;
        double totalCash = eurCash * eurPln + usdCash * usdPln + plnCash;
        System.out.println("Hello " + myName + "! " + "You have " + totalCash + " PLN.");

        System.out.println("You have a lot of money!");
    }


}
