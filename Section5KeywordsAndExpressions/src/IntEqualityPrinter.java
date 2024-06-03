public class IntEqualityPrinter {

    /*  printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(1, 2, 1);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
*/
    public static void printEqual (int myNum1, int myNum2, int myNum3){

        if (myNum1 < 0 || myNum2 <0 ||myNum3 <0 ) {
            System.out.println("Invalid Value");

        } else if (myNum1 == myNum2 && myNum2 == myNum3 ){
            System.out.println("All numbers are equal");

        } else if ((myNum1 != myNum2) && (myNum1 != myNum3) && (myNum2 != myNum3) ) {
            System.out.println("All numbers are different");

        } else
            System.out.println("Neither all are equal or different");
    }

}
