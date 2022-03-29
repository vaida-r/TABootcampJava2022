package sef.module5.activity;

public class Rectangle extends Shape {

        private double lenght;
        private double widht;

        public Rectangle() {
           this.lenght = 5;
           this.widht = 6;
        }

       public Rectangle(double lenght, double widht ) {
            this.lenght = lenght ;
            this.widht = widht;
        }


        public double calculateArea() {
                return lenght * widht ;
        }

        public double calculatePerimeter() {
                return 2 * (lenght + widht) ;
        }

    }

