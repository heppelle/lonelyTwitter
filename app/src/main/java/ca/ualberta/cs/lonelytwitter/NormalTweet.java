package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {

    NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return false;
    }
}
