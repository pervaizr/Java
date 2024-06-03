public class BarkingDog {

     /* shouldWakeUp (true, 1);
        shouldWakeUp (false, 2);
        shouldWakeUp (true, 8);
        shouldWakeUp (true, -1);*/
    // checkNumber(5);

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("Invalid Value");

            return false;
        } else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            System.out.println("Dog is barking");
            return true;
        } else {
            System.out.println("Dog is NOT barking");
            return false;
        }
    }
}
