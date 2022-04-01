package sef.FinalActivity.FirstActivity;

public class CustomException extends Exception{

    public String toString() {
            return "Name must be without numbers!";
    }


    public String getMessage() {
            return "Please set another name :)";
        }

//    public CustomException (String message){
//        super(message);
//    }

}
