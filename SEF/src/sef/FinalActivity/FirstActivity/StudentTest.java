package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase  {

    private Student student;

    String tS = "Beautiful";
    int tA = 20;
    String tN = "Jonas";


    protected void setUp() throws Exception {
        super.setUp() ;
        student = new Student(tN,tA,tS) ;
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetSchoolName () {
        tS = "Atlantic";
        student.setSchoolName(tS);
        assertEquals("Test on set school name", tS, student.getSchoolName() );
    }

    public void testGetSchoolName() {
        assertEquals("Test on get school name",tS, student.getSchoolName() );
    }


}
