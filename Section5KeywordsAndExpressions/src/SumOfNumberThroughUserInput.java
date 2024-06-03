import java.util.Scanner;

public class SumOfNumberThroughUserInput {

    public static void sumOfNumber (int number){

        int count =0;
        int sum =0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        while (i<=number) {

            System.out.println("Enter Number #" + i + ":");
            String input = scanner.nextLine();
            try {
                int parsedNumber = Integer.parseInt(input);
                sum += parsedNumber;
                i++;

            } catch (NumberFormatException nfe){
                System.out.println("Invalid Number:");

            }
        }
        System.out.println("Sum of Number = " + sum);




    }
}
