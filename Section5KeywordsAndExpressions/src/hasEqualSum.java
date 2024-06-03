public class hasEqualSum {

    /* System.out.println(hasEqualSum(1, 1, 1));
System.out.println(hasEqualSum(1, 1, 2));
System.out.println(hasEqualSum(1, -1, 0));
*/

    public static boolean hasEqualSum (int myVar1, int myVar2, int myVar3){

        if ( (myVar1 + myVar2) == myVar3) {
            return true;
        }
        else return false;
    }
}
