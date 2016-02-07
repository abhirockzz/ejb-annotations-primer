package ejbap.views.local.interfaces;

public interface TweeterInterface {
 
    public void authenticate(String tweeterID, String pswd);
    public int getRetweets(String tweetID);
    public int getLikes(String tweetID);
}
