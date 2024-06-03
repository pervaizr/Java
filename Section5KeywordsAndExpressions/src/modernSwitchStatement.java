public class modernSwitchStatement {

    // switchStatementPractice(5);
    // switchStatementPracticeWithModern ("November");

    public static void switchStatementPractice(int myValue) {

        switch (myValue) {
            case 1, 2 -> System.out.println("My value is " + myValue);
            default -> System.out.println("Some other value is provided");
        }
    }

    public static String switchStatementPracticeWithModern(String month) {

        return switch (month) {
            case "Jan", "Feb", "December" -> month;
            default -> {
                String wrongMonth = month + " Wrong value that's not defined";
                yield month;
            }
        };
    }
}
