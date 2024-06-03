public class SumChallenge {

    public static void sumChallenge() {

        int sumOfMatches = 0;
        int countOfMatches = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sumOfMatches += i;
                countOfMatches++;
                System.out.println("Found a match = " + sumOfMatches);
            }
            if (countOfMatches == 5) {
                System.out.println("Sum of first 5 matches = " + sumOfMatches);
                break;
            }
        }

    }
}

