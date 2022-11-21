import java.util.Objects;

public class PhoneBook {
    private final String fullName;
    private final String numberPhone;

    public PhoneBook(String fullName, String numberPhone) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(fullName, phoneBook.fullName) && Objects.equals(numberPhone, phoneBook.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, numberPhone);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fullName='" + fullName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
