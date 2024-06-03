public class DaysOfTheWeek {

    /*printDayOfWeek(0);
printDayOfWeek(1);
printDayOfWeek(8);
printDayOfWeek(-9);
*/

    public static void printDayOfWeek(int day){

        String dayOfTheWeek = switch (day) {
            case 0 ->  { yield  "Sunday";}
            case 1 -> "Monday";
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield"Thursday";}
            case 5 -> {yield"Friday";}
            case 6 -> {yield"Saturday";}
            default -> "Invalid Day";
        };

        System.out.println(day + " Stands for " + dayOfTheWeek);
    }
}
