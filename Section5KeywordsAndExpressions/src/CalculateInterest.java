public class CalculateInterest {
    // for (double rate = 7.5; rate <=10; rate += 0.25){
    //            double interestAmount = calculateInterest(100.0, rate);
    //            System.out.println( "100.00 $ at " + rate + "% interest = " + interestAmount );
    //
    //        }

    public static double calculateInterest(double amount, double rate){
        return (amount * (rate/100.0)) ;
    }

}
