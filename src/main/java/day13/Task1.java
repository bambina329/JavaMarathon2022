package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Rinat");
        User user2 = new User("Azaliya");
        User user3 = new User("Roma");

        user1.sendMessage(user2, "Привет ");
        user1.sendMessage(user2, "как дела? ");

        user2.sendMessage(user1, "Салам ");
        user2.sendMessage(user1, "Все хорошо!!! ");
        user2.sendMessage(user1, "Как ваши дела? ");

        user3.sendMessage(user1, "Вася ");
        user3.sendMessage(user1, "Что делаешь? ");
        user3.sendMessage(user1, "По пивку? ");

        user1.sendMessage(user1, "О какие люди ");
        user1.sendMessage(user1, "С радостью  ");
        user1.sendMessage(user1, "Когда? ");

        user3.sendMessage(user1, "да хоть сейчас?");

        MessageDatabase.showDialog(user1, user2);




    }
}
