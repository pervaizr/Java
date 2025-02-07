package com.OOP;

public class Person {

    private String  firstName;
    private String  lastName;
    private int     age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0 || age > 100) {
            this.age = 0;
        } else {

            this.age = age;
        }
    }

    public boolean isTeen(){
        if (this.age > 12 && this.age < 20) {
            return true;
        }

        return false;
    }

    public String  getFullName(){

        if  (firstName.isEmpty() && lastName.isEmpty()) {
            return "";

        } else if (firstName.isEmpty() && !lastName.isEmpty()){
            return lastName;

        } else if  (!firstName.isEmpty() && lastName.isEmpty()) {
            return firstName;

        } else return this.getFirstName() + " " + this.getLastName();


    }


}
