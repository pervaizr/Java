public class GreatestCommonDivisor {

    //System.out.println(getGreatestCommonDivisor(12, 30));

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int i = 0;
        int greatest = 0;

        //135
        for (i = first; i > 1; i--) {

            if (first % i == 0 && second % i == 0) {
                greatest = i;
                break;

            }

        }
        return greatest;
    }
}
