package ejbap.views.local;

import ejbap.views.local.interfaces.GithubAPIInterface;
import java.util.Date;
import javax.ejb.Stateless;

@Stateless
//Local view assumed by default
public class GithubRestAPIImpl implements GithubAPIInterface {

    @Override
    public Date getLastUpdated(String repoID) {
        return new Date(); //updated today !
    }

    @Override
    public int getStars(String repoID) {
        return 42;
    }

    @Override
    public int getForks(String repoID) {
        return 42;
    }

}
