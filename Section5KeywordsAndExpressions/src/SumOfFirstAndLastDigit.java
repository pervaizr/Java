public class SumOfFirstAndLastDigit {

    /* sumFirstAndLastDigit(-12);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(9);
        sumFirstAndLastDigit(12);
        sumFirstAndLastDigit(123);
        sumFirstAndLastDigit(1224);*/



    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >=10) {
            number /= 10;

        }
        return number + lastDigit;


    }

}
