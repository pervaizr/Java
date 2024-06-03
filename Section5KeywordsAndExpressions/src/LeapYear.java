public class LeapYear {

    /*
isLeapYear(-1600);
isLeapYear(1600);
isLeapYear(2017);
isLeapYear(2000);
isLeapYear(1924);
*/
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Not Leap year " + year);
            return false;

        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Leap year " + year);
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap year " + year);
            return true;
        } else System.out.println("NOt Leap year " + year);
        return false;
    }

}
