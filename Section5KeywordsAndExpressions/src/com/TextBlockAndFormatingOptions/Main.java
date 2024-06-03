package com.TextBlockAndFormatingOptions;

public class Main {

    public static void main(String[] args) {

        String bullet = "Print a bulleted list: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Second Point \n";

        System.out.println(bullet);

        String textBlock = """
                Print a bulleted list:
                    \u2022  First Point
                        \u2022  Second Point """;

        System.out.println(textBlock);

        int age = 35;
        int yearOfBirth = 2023-age;

        System.out.printf("Your age is %d %n", age); //format specifier
        System.out.printf("Your age is %.2f %n", (float) age); //.2 is for precision and f for format
        System.out.printf("Your agent is %d,  Birth Year %d %n", age, yearOfBirth);

        for(int i =1 ; i<=100000 ; i *= 10){
            System.out.printf("Printing %6d %n", i); //setting width to 6 for all the number ,used in error log and db
             }

        String formattedString = String.format("Your agent is %d", age);
        System.out.println(formattedString);

        formattedString = "Your agent is %d".formatted(age);
        System.out.println(formattedString);

    }



}
