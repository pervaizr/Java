public class UtilityMethods {

    public static void charUniCode() {
        char myCharacter = 'd';
        char myCharacterCode = 68;
        //char myCharacterUniCode = '\U+0044)';

        System.out.println(myCharacter + "   " + myCharacterCode);
    }

    public static double pondToKilograms(){
        double myPondValue = 0.453592d;
        double myKilograms = 10 * myPondValue;

        System.out.println(myKilograms);
        return myKilograms;
    }

    public static void minAndMaxValueofDataTypes(){
        System.out.println("Integer Min value is => " + Integer.MIN_VALUE + "  Integer Max value is => " + Integer.MAX_VALUE);
        System.out.println("Byte Min value is => " + Byte.MIN_VALUE + "  Byte Max value is => " + Byte.MAX_VALUE);
        System.out.println("Short Min value is => " + Short.MIN_VALUE + "  Short Max value is => " + Short.MAX_VALUE);
        System.out.println("Long Min value is => " + Long.MIN_VALUE + "  Long Max value is => " + Long.MAX_VALUE);
        System.out.println("Float Min value is => " + Float.MIN_VALUE + "  Float Max value is => " + Float.MAX_VALUE);
        System.out.println("Double Min value is => " + Double.MIN_VALUE + "  Double Max value is => " + Double.MAX_VALUE);
    }

    public void TypeCastingExample(){

        byte myByteValue = 1;
        short myShortValue = 2;
        int myIntegerValue = 3;
        long myLongValue = 4;
        char myCharCharacter = 'd';

        System.out.println(myCharCharacter);
        //int myTotalValue =  myByteValue + myShortValue + myIntegerValue + myLongValue;
        int myTotalValue =  myByteValue + myShortValue + myIntegerValue + (int) myLongValue;
        System.out.println(myTotalValue);
    }

    public static void challengeOperators(){

        double myFirstDoubleVar = 20.00;
        double mySecondDoubleVar = 80.00;
        double totalValue = ((myFirstDoubleVar + mySecondDoubleVar) * 100.00);

        double myRemainder = totalValue/40.00 ;
        System.out.println( "My remainder value is = " + myRemainder);

        boolean remainderValue = myRemainder == 0.00 ? true : false;
        System.out.println("My remainder value is = " + remainderValue);

        if (remainderValue == true) {
            System.out.println("GOT SOME Remainder");
        } else {
            System.out.println("NO Remainder");
        }




    }
}
