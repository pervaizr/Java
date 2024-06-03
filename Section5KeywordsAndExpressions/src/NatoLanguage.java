public class NatoLanguage {

     /*    natoLanguage('A');
        natoLanguage('B');
        natoLanguage('Z');
*/

    public static void natoLanguage(char natoLanguage) {

        switch (natoLanguage) {

            case 'A':
                System.out.println(natoLanguage + " for Able");
                break;
            case 'B':
                System.out.println(natoLanguage + " for Baker");
                break;
            case 'C':
                System.out.println(natoLanguage + " for Charlie");
                break;
            case 'D':
                System.out.println(natoLanguage + " for Dog");
                break;
            case 'E':
                System.out.println(natoLanguage + " for Easy");
                break;
            default:
                System.out.println("Letter " + natoLanguage + " not found in swithc statement");

        }
    }
}
