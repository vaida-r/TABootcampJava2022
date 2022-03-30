package sef.module9.activity;

import junit.framework.TestCase;
import sef.module9.sample.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonTest extends TestCase {

    private Person person;

    float tH = 1.25f;
    int tW = 30;

// for setUp(), tearDown() and first three tests I add system.print and person.print methods
// just for understanding what is happening, how these tests are calling


    //TODO: create set up
    protected void setUp() throws Exception {
        System.out.println("***********************   I'm doing person setup  *** "); // just for curiosity
        super.setUp() ;
        person = new Person();
        person.setHeight(tH);
        person.setWeight(tW);

        person.print();    // just for curiosity

    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        System.out.println("***********************   now all are going tear down  *** \n"); // just for curiosity
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetWeightAndHeight(){
        System.out.println("***   I'm doing testSetWeightAndHeight *** ");  // just for curiosity
        int nW = 60;
        float nH = 1.6f;
        person.setWeight(nW);
        person.setHeight(nH);
        assertEquals("test weight setting",nW, person.getWeight()) ;
        assertEquals("test height setting",nH, person.getHeight()) ;

        person.print();    // just for curiosity

    }

    public void testGetWeightAndHeight(){
        System.out.println("***   I'm doing testGetWeightAndHeight *** ");  // just for curiosity

        assertEquals("test on get weight",tW, person.getWeight()) ;
        assertEquals("test on get height",tH, person.getHeight()) ;

        person.print() ;  // just for curiosity
    }


    //TODO: create unit test for getBodyMassIndex method

    public void testCalcBMI(){
        System.out.println("***   I'm doing testCalcBMI *** ");  // just for curiosity

        String exp = Float.toString(tW/(tH*tH));
        assertEquals("test on calcBMI",exp,person.calcBMI());

        person.print() ;  // just for curiosity
    }


    public void testCalcBMIFloat(){     // if all correct, there is no any prints except from setUp()

        float exp = tW/(tH*tH);
        assertEquals("float type, test on calcBMI",exp, person.calcBMIFloat(),1);


    }




}
