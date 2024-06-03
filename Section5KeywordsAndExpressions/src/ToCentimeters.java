public class ToCentimeters {

    //         System.out.println("5f, 8I = " + convertToCentimeters(5, 8) + " cm");
//        System.out.println("68I = " + convertToCentimeters(68) + " cm");

    public  static double convertToCentimeters(int inches){
        return inches * 2.54 ;
    }

    public  static double convertToCentimeters(int feet, int inches){
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;

    }


}
