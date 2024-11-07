package models;

import java.util.Date;

public class Session {
    private User user;
    private Date loginTime;
    private Date logoutTime;
    private boolean isOnline;
    private static Session instance;

    private Session(User user) {
        this.user = user;
        this.loginTime = new Date();
        this.isOnline = true;
    }

    public void logout() {
        this.logoutTime = new Date();
        this.isOnline = false;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public static Session getInstance(User user) {
        if (instance == null) {
            instance = new Session(user);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Session{" +
                "user=" + user +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", isOnline=" + isOnline +
                '}';
    }
}
