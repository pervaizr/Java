public class SumDigit {

    //  System.out.println("Total Sum = " + (sumDigits(1234)));
    //        System.out.println("Total Sum = " + (sumDigits(8)));
    //        System.out.println("Total Sum = " + (sumDigits(-22)));


    public static int sumDigits(int number) {

        if (number <= 0) {
            return -1;
        }

        int totalSum = 0;

        while (number > 9) {
            totalSum += (number % 10);
            number = number / 10;
        }

        totalSum += number;
        return  totalSum;

    }


}
