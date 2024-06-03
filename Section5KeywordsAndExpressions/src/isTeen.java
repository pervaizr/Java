public class isTeen {

            /*      System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
*/

    public static boolean hasTeen(int myVar1, int myVar2, int myVar3) {

        if ((myVar1 >= 13 && myVar1 <= 19) || (myVar2 >= 13 && myVar2 <= 19) || (myVar3 >= 13 && myVar3 <= 19)) {
            return true;
        } else return false;

    }

    public static boolean isTeen(int isTeen) {
        if (isTeen >= 13 && isTeen <= 19) {
            return true;
        } else return false;

    }
}
