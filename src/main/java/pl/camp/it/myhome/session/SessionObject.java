package pl.camp.it.myhome.session;

import pl.camp.it.myhome.model.User;

public class SessionObject {

    private User user;
    private String lastAddress;
    private String lastFindPattern;

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public String getLastAddress() { return lastAddress; }

    public void setLastAddress(String lastAddress) { this.lastAddress = lastAddress; }

    public String getLastFindPattern() { return lastFindPattern; }

    public void setLastFindPattern(String lastFindPattern) { this.lastFindPattern = lastFindPattern; }


}
