public class DaysInMonth {

    /*System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));*/
    public static boolean isLeapYear (int year){
        if (year<1 || year>9999){
            return false;

        } else if ((year % 4 ==0) && (year %100 != 0)){
            return true;


        } else if ((year % 100 == 0) && (year %400 ==0)) {
            return true;

        } return  false;

    }

    public static int getDaysInMonth(int month, int year) {
        if ((month <0 || month >12) || (year <1 || year >9999))  {
            return -1;
        }

        if( (isLeapYear(year)) && month ==2) {
            return 29;
        }
        return switch (month) {

            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> -1;
        };

    }

}
