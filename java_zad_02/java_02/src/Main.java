public class Main {
    private String firstName;
    private String lastName;
    private String group;
    private String major;

    public Main(String firstName, String lastName, String group, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Grupa: " + group);
        System.out.println("Kierunek studiów: " + major);
    }

    public static void main(String[] args) {
        Main student = new Main("Jan", "Kowalski", "A1", "Informatyka");
        student.displayInfo();
    }
}