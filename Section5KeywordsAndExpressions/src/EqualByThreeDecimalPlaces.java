public class EqualByThreeDecimalPlaces {
    /*areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    areEqualByThreeDecimalPlaces(3.175, 3.176);
    areEqualByThreeDecimalPlaces(3.0, 3.0);
    areEqualByThreeDecimalPlaces(-3.123, 3.123);*/
    public static boolean areEqualByThreeDecimalPlaces (double myFirstNumber, double mySecondNumber){
        myFirstNumber = (long) (myFirstNumber * 1000);
        mySecondNumber =  (long) (mySecondNumber * 1000);

        if (myFirstNumber == mySecondNumber) {
            System.out.println("First Number = " +  myFirstNumber + " Second Number = " + mySecondNumber );
            return true;

        } else System.out.println("First Number Not Equal = " +  myFirstNumber + " Second Number Not Equal = " + mySecondNumber );
        return  false;

    }
}
