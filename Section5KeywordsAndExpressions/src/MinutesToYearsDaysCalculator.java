public class MinutesToYearsDaysCalculator {

    /*        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(15);
        printYearsAndDays(0);
        printYearsAndDays(-12);*/

    public static void printYearsAndDays(long minutes) {
        // years and days from the minutes parameter

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60L;
        long days = hours / 24L;
        long years = days / 365L;
        long daysLeft = days % 365L;

        System.out.println(minutes + " min = " + years + " y and " + daysLeft + " d");

    }

}
