public class LargestPrime {

        // write code here
    /*getLargestPrime(21);
        getLargestPrime(45);
*/
        public static int getLargestPrime(int number) {
            if(number < 2) {
                return -1;
            }

            for (int i = 2; i < number; i++) {
                if(number % i == 0) {
                    number = number/ i;
                    i--;
                }
            }
            return number; // return prime number
        }

}
