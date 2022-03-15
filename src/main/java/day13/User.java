package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public void subscribe(User user) {
        boolean is = isSubscribed(user);
        if (is == false) {
            subscriptions.add(user);
        } else {
            System.out.println("Пользователь уже подписан на " + user);
        }
    }
    public boolean isSubscribed(User user) {

        return this.subscriptions.contains(user);
    }

    @Override
    public String toString() {

        return username;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public User(String username) {

        this.username = username;
        this.subscriptions= new ArrayList<>();
    }

    public String getUsername() {

        return username;
    }

    public List<User> getSubscriptions() {

        return subscriptions;
    }


}
