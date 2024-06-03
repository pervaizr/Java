package com.InheritanceJavaLangObjectStduent;

public class Main {
    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max);

        primaryStudent jimmy = new primaryStudent("Jimmy", 22, "Carol");
        System.out.println(jimmy);
    }

}

class Student extends Object {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return name + " is " + age;
        /*return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';*/
    }

}

class primaryStudent extends Student {

    private String parentName;

    primaryStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;

    }

    @Override
    public String toString() {
        return    "primaryStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + parentName + "'s kid " + super.toString();
    }
}
