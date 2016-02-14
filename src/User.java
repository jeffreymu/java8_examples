import java.util.List;

/**
 * Created by JeffreyMu on 2/14/16.
 */
public class User {
    private final String userid;
    private final String username;
    private final List<String> tags;


    public User(String userid, String username, List<String> tags) {
        this.userid = userid;
        this.username = username;
        this.tags = tags;

    }

    public String getUserid() {
        return userid;
    }


    public List<String> getTags() {
        return tags;
    }

    public java.lang.String getUsername() {
        return username;
    }
}
