public class DiamondPrint {

    public static   void diamondProgram(int number){

        int i, j, k, space = number -1;

        for (i=1; i < number; i++)
        {
            for (j=1; j< space; j++)
            {
                System.out.print(" ");
            }
            space --;

            for (k=1; k<=(2*i)-1; k++)
            //for (k=i; k>0; k--)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
        space = 1;

        for (i=1; i<= number - 1; i ++){

            for (j=1; j< space; j++){
                System.out.print(" ");
            }
            space ++;
            for (k=1; k<= 2 * (number -i) - 1; k++){
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
