import java.util.ArrayList;

public class Notebook {
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<User> setUsers(User user) {
        users.add(user);
        return users;
    }

}

class User {
    private String name;
    private String surname;
    private String patronymic;
    private String nickname;

    public User(String name, String surname, String patronymic, String nickname) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.nickname = nickname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
