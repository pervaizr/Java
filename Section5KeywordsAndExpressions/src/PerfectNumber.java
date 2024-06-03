public class PerfectNumber {

    /* System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(-12));
        System.out.println(isPerfectNumber(28));*/


    public static boolean isPerfectNumber (int number){
        if (number<1){
            return false;
        }
        // 6   1 2 3
        int sum = 0;
        for (int i=1; i<number; i++){
            if(number % i ==0){
                sum += i;
            }
        } return (sum == number);


    }
}
