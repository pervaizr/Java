public class EvenAndOddNumberChallenge {
//
//    int number = 4;
//    int finishNumber = 20;
//    int totalEvenNumbersFound = 0;
//    int totalOddNumbersFound = 0;
//
//        while (number <= finishNumber){
//        number ++;
//        if (!isEvenNumber(number)){
//            totalOddNumbersFound++;
//            continue;
//        }
//        System.out.println("Even Number = " + number);
//        totalEvenNumbersFound++;
//        if (totalEvenNumbersFound == 5){
//            System.out.println("Total Even Number Found = " + totalEvenNumbersFound);
//            System.out.println("Total Odd Number Found = " + totalOddNumbersFound);
//            break;
//        }}


    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
