package sef.module7.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // TODO: use try
        // TODO: create catch for try and use IndexOutOfBoundsException
        // TODO: In catch create custom System.out.println message
        // TODO: Use method that this message gets printed out whether or not error has occurred
        try {
            for (int i = 0; i <= 12; i++) {
                System.out.println(arr[i]);
            }
        }    catch(IndexOutOfBoundsException indexOutOfBoundsException ){
                  System.out.println("IndexOutOfBoundsException");
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }






    }

}
