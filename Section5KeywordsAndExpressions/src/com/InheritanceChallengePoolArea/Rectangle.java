package com.InheritanceChallengePoolArea;

public class Rectangle {

    private double width;
    private double length;

    public  Rectangle(double width, double length){
        this.width = width <    0  ? 0 : width;
        this.length = length <  0   ? 0 : length;
    }


    //Method named getArea without any parameters, it needs to return the calculated area (width * length).

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width * length;
    }

}
