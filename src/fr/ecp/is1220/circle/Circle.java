package fr.ecp.is1220.circle;

import static java.lang.StrictMath.sqrt;

public class Circle {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public boolean isInscribed(Square s){
        if(((this.getRadius()) * 2) >= (s.getSide() * sqrt(2)))
            return true;

        return false;
    }

    @Override
    public String toString() {
        return this.color + " circle with radius " + this.getRadius();
    }
}
