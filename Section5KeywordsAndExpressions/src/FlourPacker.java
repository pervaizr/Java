public class FlourPacker {

    /* System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));

*/
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int maxValue = (bigCount * 5) + smallCount; //= 10 >9

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return maxValue >= goal && goal % 5 <= smallCount;
    }
}