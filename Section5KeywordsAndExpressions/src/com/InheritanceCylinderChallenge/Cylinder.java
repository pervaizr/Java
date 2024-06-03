package com.InheritanceCylinderChallenge;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0? 0 : height;
    }


    // it needs to return the calculated volume. To calculate volume multiply the area with height.

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea() * getHeight();
    }

}
