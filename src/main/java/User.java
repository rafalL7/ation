import java.util.Objects;

public class User {
    String name;
    String secondName;
    double dateOfBirthDay;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dateOfBirthDay=" + dateOfBirthDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Double.compare(user.dateOfBirthDay, dateOfBirthDay) == 0 && Objects.equals(getName(), user.getName()) && Objects.equals(secondName, user.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), secondName, dateOfBirthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
