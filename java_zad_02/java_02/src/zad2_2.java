import java.util.Scanner;

public class zad2_2 {

    public static class Student {
        private static String firstName;
        private static String lastName;
        private static int group;
        private static String major;

        public Student(String firstName, String lastName, int group, String major) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.major = major;
        }

        public static void displayInfo() {
            System.out.println("firstname: " + firstName);
            System.out.println("lastname: " + lastName);
            System.out.println("Group: " + group);
            System.out.println("Major: " + major);
        }

        public static void crate(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student name:");
            firstName=scanner.nextLine();
            System.out.println("Enter student lastname:");
            lastName=scanner.nextLine();
            System.out.println("Enter student group:");
            group=scanner.nextInt();
            System.out.println("Enter student major:");
            major=scanner.next();

        }

    }

    public static void main(String[] args) {
        Student.crate();
        Student.displayInfo();
    }
}
