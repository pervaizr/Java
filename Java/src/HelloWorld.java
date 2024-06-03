public class HelloWorld extends UtilityMethods {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //new UtilityMethods() = new UtilityMethods()
        //pondToKilograms();
        // charUniCode();
        // itenaryPractice();

        challengeOperators();


        boolean isCar = false;
        if (!isCar) {
            System.out.println("Something wrong with the statement shouldn't happen");
        } else {
            System.out.println("Its a Car");
        }


    }

    public static void charUniCode() {
        char myCharacter = 'd';
        char myCharacterCode = 68;
        //char myCharacterUniCode = '\U+0044)';

        System.out.println(myCharacter + "   " + myCharacterCode);

    }

    public static double pondToKilograms() {
        double myPondValue = 0.453592d;
        double myKilograms = 10 * myPondValue;
        System.out.println(myKilograms);
        return myKilograms;

    }

    public static void itenaryPractice() {
        int myItenaryValue = 20;
        myItenaryValue = (10 > 20) ? 50 : 100;
        System.out.println(myItenaryValue);

        String makeOfCar = "Honda";
        String isDomestic = (makeOfCar == "Honda") ? "TRUE" : "false";
        System.out.println(isDomestic);

    }

    public static void challengeOperators() {

        double myFirstDoubleVar = 20.00d;
        double mySecondDoubleVar = 80.00d;
        double totalValue = ((myFirstDoubleVar + mySecondDoubleVar) * 100.00d);
        System.out.println("My Total Value is = " + totalValue);

        double theRemainder = totalValue % 40.00d;
        System.out.println("The remainder value is = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("GOT SOME Remainder");
        }

    }


}