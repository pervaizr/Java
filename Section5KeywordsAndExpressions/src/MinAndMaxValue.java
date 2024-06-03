import java.util.Scanner;

public class MinAndMaxValue {

    public static void minAndMax(){

        double minNumber =0;
        double maxNumber =0;
        int loopCount = 0;

        while(true){

            Scanner scanner = new Scanner(System.in);
            System.out.println(" **** Enter a number OR any character to quit **** ");

            try{
                double userInput = Double.parseDouble(scanner.nextLine());

                if (loopCount == 0 ){
                    maxNumber = userInput;
                    minNumber = userInput;
                } else if (userInput < minNumber)  {
                    minNumber = userInput;
                } else if (userInput > maxNumber){
                    maxNumber = userInput;
                }
                loopCount ++;

            } catch (Exception e){
                System.out.println("Character Received, Exiting!! ");
                System.out.println("");
                break;
            }

        }
        System.out.println("Program Executed for " + loopCount + " Times");
        System.out.println("The minimum number Entered = " + minNumber);
        System.out.println("The Maximum number Entered = " + maxNumber);







    }
}
