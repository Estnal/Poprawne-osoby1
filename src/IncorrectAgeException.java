public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(){
        super("Podaj wiek większy niż 1");
    }
}
