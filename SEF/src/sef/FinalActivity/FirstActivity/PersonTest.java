package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    String tN = "Kamile";
    int tA = 50;


    protected void setUp() throws Exception {
        super.setUp() ;
        person = new Person(tN ,tA) ;
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testGetAge() {
        assertEquals("test on get age",tA, person.getAge()) ;
    }


    public void testSetAge() {
        int tA = 50;
        person.setAge(tA);
        assertEquals("Age setter test failed!", tA, person.getAge() ) ;

        tA = -50;
        person.setAge(tA);
        assertEquals("Age setter test failed!", tA, person.getAge() ) ;

    }


    public void testGetName() {
        assertEquals("test on get name",tN, person.getName()) ;
    }


    public void testSetName() throws CustomException {

        String tN = "Joana";
        person.setName(tN );
        assertEquals ("Set name test failed",tN,person.getName() );

        tN = "Petras pirmasis";
        person.setName(tN );
        assertEquals ("Set name test failed",tN,person.getName() );

    }


    public void testThrowException(){

        try {
            person.setName("Petras2");
            person.setName("88887abc");
            new Person("23",23);
        } catch (CustomException e) {
            return;
        } catch (Exception e){
            return;
        } catch (Error e) {
            fail();
        }

    }











}
