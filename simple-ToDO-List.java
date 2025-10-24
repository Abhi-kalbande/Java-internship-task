import java.util.*;

public class TodoListApp {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Task 2. View Tasks 3. Remove Task 4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(sc.nextLine());
            } else if (choice == 2) {
                System.out.println("Your Tasks:");
                for (int i = 0; i < tasks.size(); i++)
                    System.out.println((i + 1) + ". " + tasks.get(i));
            } else if (choice == 3) {
                System.out.print("Enter task number to remove: ");
                int index = sc.nextInt() - 1;
                if (index >= 0 && index < tasks.size())
                    tasks.remove(index);
            } else {
                break;
            }
        }
        System.out.println("Exiting Todo App...");
    }
}
