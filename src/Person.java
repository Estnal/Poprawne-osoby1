public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) {
        checkNames(firstName, lastName);
        checkAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    private void checkNames(String firstName, String lastName) {
        if (firstName == null) {
            throw new NameUndefinedException();
        } else if (lastName == null) {
            throw new NameUndefinedException();
        } else if (firstName.length() < 2) {
            throw new NameUndefinedException();
        } else if (lastName.length() < 2) {
            throw new NameUndefinedException();
        }
    }
    private void checkAge(int age){
        if (age <1){
            throw new IncorrectAgeException();
        }
    }
}

