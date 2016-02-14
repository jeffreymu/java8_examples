import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static User getFirstUser(List<User> users) {
        for (User u : users) {
            if (u.getTags().contains("java")) {
                return u;
            }

        }
        return null;
    }

    public static Optional<User> getFirstJavaUser(List<User> users) {
        return users.stream()
                .filter(user -> user.getTags().contains("java"))
                .findFirst();
    }

    public static Map<String, List<User>> groupByUser(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getUserid));
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<User> users = new ArrayList<User>();
        List<String> tags = new ArrayList<String>();
        tags.add("java");
        tags.add("golang");
        User user = new User("1", "jeff", tags);
        users.add(user);
        //get the first user by java
        User us = getFirstJavaUser(users).get();
        System.out.println(us.getUsername());
    }
}
