import java.util.*;

class Student {
    int id;
    String name;
    String grade;

    Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student(1, "Aparna", "A"));
        students.add(new Student(2, "Rahul", "B"));
        students.add(new Student(3, "Meera", "A-"));

        Scanner sc = new Scanner(System.in);
        System.out.println("1. View 2. Add 3. Delete:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                students.forEach(System.out::println);
                break;
            case 2:
                System.out.print("Enter ID, Name, Grade: ");
                students.add(new Student(sc.nextInt(), sc.next(), sc.next()));
                break;
            case 3:
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                students.removeIf(s -> s.id == id);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
