package ca.ualberta.cs.lonelytwitter;

public class TooLongException extends Exception {
    public TooLongException(String message){
        super(message);
    }
}
