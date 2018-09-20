package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;

    public Tweet(String message){
        this.message=message;
    }

    public void setMessage(String message) throws TooLongException{
        if (message.length()>140){
            throw new TooLongException(message);
        }
        this.message = message;
    }

    public void setDate(){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract boolean isImportant();


}
