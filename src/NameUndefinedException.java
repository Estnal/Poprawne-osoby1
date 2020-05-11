public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException(){
        super("Wprowadz imię lub nazwisko które posiada więcej niż 2 znaki");
    }
}
