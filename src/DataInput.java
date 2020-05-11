import java.util.Scanner;

public class DataInput {


    Scanner scanner = new Scanner(System.in);

    public Person createPerson() {

        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        System.out.println("Podaj pesel:");
        int pesel = scanner.nextInt();
        return new Person(firstName, lastName, age, pesel);
    }
}









