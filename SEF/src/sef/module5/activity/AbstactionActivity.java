package sef.module5.activity;

public class AbstactionActivity {

    public static void main(String[] args){

        Rectangle  r = new Rectangle();
        r.setColor("red");

        Circle c = new Circle(5);
        c.setColor("blue");

        System.out.println("Color  : " + r.getColor() );
        System.out.println("Area   : " + r.calculateArea());
        System.out.println("Perimeter  : " + r.calculatePerimeter() );

        System.out.println("Color  : " + c.getColor() );
        System.out.println("Area   : " + c.calculateArea());
        System.out.println("Perimeter  : " + c.calculatePerimeter() );

    }

}
