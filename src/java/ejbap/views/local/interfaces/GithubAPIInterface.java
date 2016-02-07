package ejbap.views.local.interfaces;

import java.util.Date;

public interface GithubAPIInterface {
    public Date getLastUpdated(String repoID);
    public int getStars(String repoID);
    public int getForks(String repoID);

}
