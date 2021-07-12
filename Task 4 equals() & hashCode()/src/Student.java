import java.util.Objects;

public class Student {
    private String group;
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (o instanceof Student) {
            Student temp = (Student) o;
            return age == temp.age && group.equals(temp.group) && name.equals(temp.name);
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return (int)(17*age + ((name==null)? 0 : name.hashCode() + ((group==null)? 0 : group.hashCode())));
    }
}
