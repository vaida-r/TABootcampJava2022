package sef.module7.activity;

//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
    public static void main(String[] args) {
        new ExceptionSequenceActivity().divide(10, 0);
        new ExceptionSequenceActivity().divide(10, 2);
    }

    void divide(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        }
        /////// I think that this exception we do no need and I sent it to comments

//        catch (Exception e) {
//            System.out.println("Exception!!!");
//      }
        catch (ArithmeticException a) {
            System.out.println("Division by zero is not allowed");
        }

    }
}
