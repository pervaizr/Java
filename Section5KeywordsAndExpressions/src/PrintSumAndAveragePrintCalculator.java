import java.util.Scanner;

public class PrintSumAndAveragePrintCalculator {

    public static void inputThenPrintSumAndAverage (){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        boolean validNumber = true;
        int loopCount = 0;

        try {
            do  {
                int userInput = Integer.parseInt(scanner.nextLine());
                loopCount++;

                sum += userInput;
                average = Math.round((double) sum/loopCount);

            } while (validNumber = true);

        } catch (NumberFormatException nfe) {
            System.out.println("SUM = " + sum + " AVG = " + average);


        }


    }
}
