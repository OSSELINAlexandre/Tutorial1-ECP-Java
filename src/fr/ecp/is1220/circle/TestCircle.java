package fr.ecp.is1220.circle;

import static java.lang.StrictMath.sqrt;

public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 =  new Circle(2);
        Circle c3 = new Circle(3, "yellow");

        System.out.println("For C1; Radius = " + c1.getRadius() + " & area of " + c1.getArea());
        System.out.println("For C2; Radius = " + c2.getRadius() + " & area of " + c2.getArea());
        System.out.println("For C3; Radius = " + c3.getRadius() + " & area of " + c3.getArea());

        Square s1 = new Square(sqrt(2));
        Square s2 = new Square(4);

        System.out.println("TESTING WHICH SQUARE CAN BE INSCRIBED IN A CIRCLE using doubles");

        // verifying if square s1 can be inscribed in circle c1
        if(c1.isInscribed(s1)){
            System.out.println( "square s1 " + s1 + " can be inscribed in circle c1 " + c1);
        }
        else{
            System.out.println( "square s1 " + s1 + " cannot be inscribed in in circle c1 " + c1);
        }

        // verifying if square s1 can be inscribed in circle c2
        if(c2.isInscribed(s1)){
            System.out.println("square s1  " + s1 +" and can be inscribed in circle c2 " + c2);
        }
        else{
            System.out.println("square s1 " + s1 +" and CANNOT be inscribed in circle c2 " + c2 );
        }

        // verifying if square s1 can be inscribed in circle c3
        if(c3.isInscribed(s1)){
            System.out.println("square s1 " + s1 +" and can be inscribed in circle c3 " + c3);
        }
        else{
            System.out.println("square s1 " + s1 +" and CANNOT be inscribed in circle c3 " + c3);
        }


    }
}
