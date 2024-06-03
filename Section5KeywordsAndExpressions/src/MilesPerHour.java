public class MilesPerHour {

    /* toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);*/
    public static long toMilesPerHour(double kilometersPerHour) {


        if (kilometersPerHour < 0) {
            return -1;

        } else return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour) {


        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

    }
}
