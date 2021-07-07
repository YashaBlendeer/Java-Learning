package Model;

import java.util.ArrayList;

public class Model {
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<User> setUsers(String name, String surname, String patronymic, String login) {
        users.add(new User(name, surname, patronymic, login));
        return users;
    }
}
