public class EvenNumberSum {

    /* System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(9));
        System.out.println(getEvenDigitSum(6));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        */

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }

        int sumOfEvenNumber = 0;
        int remainder =0;

        if ((number <10) && (number % 2 ==0)){
            return sumOfEvenNumber = number;
        }


        while (number >0) {

            remainder  = number % 10;
            if (remainder % 2 ==0)
            {
                sumOfEvenNumber = sumOfEvenNumber + remainder;
            }
            number /= 10;
        } return sumOfEvenNumber ; //sumOfEvenNumber = (number % 2 ==0 ? sumOfEvenNumber + number : sumOfEvenNumber)  ;


    }

}
