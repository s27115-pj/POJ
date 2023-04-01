public class zad2_1 {

    public static class Student {
        private String firstName;
        private String lastName;
        private int group;
        private String major;

        public Student(String firstName, String lastName, int group, String major) {
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

    }

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 1, "Informatyka");
        student.displayInfo();
    }
}
