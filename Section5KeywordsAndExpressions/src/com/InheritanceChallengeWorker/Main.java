package com.InheritanceChallengeWorker;

public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "01/01/1984", "01/09/2009");
        System.out.println(tim);
        System.out.println("Age " + tim.getAge());
        System.out.println("Pay " + tim.collectPay());
        System.out.println("_____");





        SalariedEmployee joy = new SalariedEmployee("joy", "01/01/1987", "01/09/2020", 35000);

        System.out.println(joy);
        System.out.println("Joe pay check =$ " + joy.collectPay());
        joy.retire();
        System.out.println("Joes Pension check =$" + joy.collectPay());
        System.out.println("_____");

        HourlyEmployee mary = new HourlyEmployee("Mary", "01/01/2000", "23/12/2014", 15);
        System.out.println(mary);
        System.out.println("Mary is pay check =$" + mary.collectPay());
        System.out.println("Mary holiday pay check =$" + mary.getDoublePay());

    }
}
