package sef.FinalActivity.SecondActivity;


public class Calculator {


    public static int add(Integer x, Integer y) {
        try {
            return x + y;
        } catch (NullPointerException n){
            throw new NullPointerException("It can not be Null in operators!");
        }
    }


    public static int subtract(Integer x, Integer y) {
        try {
            return x - y;
        } catch (NullPointerException n){
            throw new NullPointerException("It can not be Null in operators!");
        }
    }


    public static int multiply(Integer x, Integer y) {     // multiplying by zero is a normal operation. I better will add Null pointer exception
        try {
            return x * y;
        } catch (NullPointerException n){
            throw new NullPointerException("It can not be Null in operators!");
        }
    }


    public Float divideFloat(float x, float y) {           // float operators division result is not an ArithmeticException in Java, but +-Infinity or NaN

        if (x == 0 && y == 0) {
            throw new ArithmeticException("Division by zero!") ;
        } else if (x>0 && y == 0) {
            throw new ArithmeticException("Division by zero!") ;
        } else if (x<0 && y==0){
            throw new ArithmeticException("Division by zero!") ;
        }
        return x/y;

    }


    public Integer divide(int x, int y) {
        try{
            return x / y;
        } catch (ArithmeticException e){
            throw new ArithmeticException("Division by zero!") ;
        }
    }



}
