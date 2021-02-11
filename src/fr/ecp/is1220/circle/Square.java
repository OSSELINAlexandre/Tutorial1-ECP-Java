package fr.ecp.is1220.circle;

public class Square {


    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public Square(double radius) {
        this.side = radius;
        color = "red";
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return side * side;
    }

    public boolean isInscribed(Circle c){
        if(this.side >= (c.getRadius() * 2))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return this.color + " square of side " + this.getSide();
    }
}
