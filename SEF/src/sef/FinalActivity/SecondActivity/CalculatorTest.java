package sef.FinalActivity.SecondActivity;

import junit.framework.TestCase;


public class CalculatorTest extends TestCase  {

    private Calculator calc;


    protected void setUp() throws Exception {
        super.setUp() ;
        calc = new Calculator() ;
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testAdd(){
        int a = 5;
        int b = 10;
        //	two positive values
        assertEquals(15, calc.add(a,b));
        assertEquals(15, calc.add(b,a));

        a = -5;
        b = 10;
        // a positive value and a negative value
        assertEquals(5, calc.add(a,b));
        assertEquals(5, calc.add(b,a));

        a = -5;
        b = -10;
        // two negative values
        assertEquals(-15, calc.add(a,b));
        assertEquals(-15, calc.add(b,a));

    }

    public void testSubtract(){
        int a = 5;
        int b = 10;
        //	two positive values
        assertEquals(-5, calc.subtract(a,b));
        assertEquals(5, calc.subtract(b,a));

        a = -5;
        b = 10;
        //	a positive value and a negative value
        assertEquals(-15, calc.subtract(a,b));
        assertEquals(15, calc.subtract(b,a));

        a = -5;
        b = -10;
        //	two negative values
        assertEquals(5, calc.subtract(a,b));
        assertEquals(-5, calc.subtract(b,a));

    }

    public void testMultiply(){

        int a = 5;
        int b = 10;
        //	two positive values
        assertEquals(50, calc.multiply(a,b));
        assertEquals(50, calc.multiply(b,a));

        a = -5;
        b = 10;
        //	a positive value and a negative value
        assertEquals(-50, calc.multiply(a,b));
        assertEquals(-50, calc.multiply(b,a));

        a = -5;
        b = -10;
        //	two negative values
        assertEquals(50, calc.multiply(a,b));
        assertEquals(50, calc.multiply(b,a));

        a = 0;
        b = 10;
        //	zero and positive value
        assertEquals(0, calc.multiply(a,b));
        assertEquals(0, calc.multiply(b,a));

        a = 0;
        b = -10;
        //	zero and negative value
        assertEquals(0, calc.multiply(a,b));
        assertEquals(0, calc.multiply(b,a));


        a = 0;
        b = 0;
        //	two zero values
        assertEquals(0, calc.multiply(a,b));
        assertEquals(0, calc.multiply(b,a));


    }

    public void testDivide(){

        assertEquals("error with two positive",5, calc.divide(50,10),0);
        assertEquals("error with positive and negative",-2, calc.divide(10,-5),0.0);
        assertEquals("error with two negative",5, calc.divide(-50,-10),0);
        assertEquals("error with zero and positive",0, calc.divide(0,23),0);
        assertEquals("error with zero and negative",0, calc.divide(0,-45),0);

    }

    public void testDivideFloat(){
        
//        assertEquals("Division zero by zero test failed",Float.NaN , calc.divideFloat(0,0) );
//        assertEquals("Division by zero test failed",Float.POSITIVE_INFINITY, calc.divideFloat(10,0) );
//        assertEquals("Division by zero test failed",Float.NEGATIVE_INFINITY, calc.divideFloat(-10,0) );
        assertEquals("Float division test failed",0.2f, calc.divideFloat(25,125) );
        assertEquals("Float division test failed",25f, calc.divideFloat(125,5) );

    }


    public void testThrowException(){

        try {
              calc.add(1,null);
              calc.add(null,null);
              calc.add(null,1);
              calc.subtract(1,null);
              calc.subtract(null,null);
              calc.subtract(null,1);
              calc.multiply(10,null);
              calc.multiply(null,null);
              calc.multiply(null,10);
              calc.divide(10, 0);
              calc.divideFloat(10,0);
              calc.divideFloat(-10,0);
              calc.divideFloat(0,0);
        } catch (ArithmeticException e) {
            return;
        } catch (NullPointerException e){
            return;
        } catch (Exception e){
            return;
        } catch (Error e) {
            fail();
        }

    }


}
