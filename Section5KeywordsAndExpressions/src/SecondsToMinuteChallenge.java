public class SecondsToMinuteChallenge {


        /*System.out.println(getDurationString(120));
        System.out.println(getDurationString(119));
        System.out.println(getDurationString(-120));
        System.out.println(getDurationString(59));
        System.out.println(getDurationString(60));*/

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Bad value provided";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }


    public static String getDurationString(int minutes, int seconds) {

        if (minutes <= 0 && minutes > 59) {
            return "Bad value provided";

        }
        int hours = seconds / 3600;
        return hours + "h " + minutes + "m " + seconds + "s ";
    }




}
