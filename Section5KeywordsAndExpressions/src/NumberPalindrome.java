public class NumberPalindrome {

    /*System.out.println(isPalindrome(15));
        //System.out.println(isPalindrome(9));
        System.out.println(isPalindrome(121));
        //System.out.println(isPalindrome(202));
        //System.out.println(isPalindrome(123456));
        System.out.println(isPalindrome(-121));*/

    public static boolean isPalindrome (int number) {

        int reversedNum = 0;
        int remainder;
        int orginalNumber = number;

        while (number != 0){
            remainder =     (number % 10);
            reversedNum = (reversedNum * 10)  + remainder;
            number /=  10;

        }

        if (orginalNumber ==  reversedNum){
            return true;

        }  else {
            return  false;
        }

    }

}
