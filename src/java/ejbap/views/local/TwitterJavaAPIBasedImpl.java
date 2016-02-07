package ejbap.views.local;

import ejbap.views.local.interfaces.TweeterInterface;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(TweeterInterface.class)
public class TwitterJavaAPIBasedImpl {

    public void authenticate(String tweeterID, String pswd) {
        //logic
    }

    public int getRetweets(String tweetID) {
        return 42;
    }

    public int getLikes(String tweetID) {
        return 42;
    }

}
