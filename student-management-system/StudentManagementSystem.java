import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            showMenu();
            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting Student Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
    }

    private static void addStudent() {
        int id = readPositiveInt("Enter student ID: ");

        if (findStudentById(id) != null) {
            System.out.println("A student with this ID already exists.");
            return;
        }

        String name = readRequiredText("Enter student name: ");
        int age = readPositiveInt("Enter student age: ");
        String course = readRequiredText("Enter student course: ");

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudent() {
        int id = readPositiveInt("Enter student ID to search: ");
        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student found: " + student);
        }
    }

    private static void updateStudent() {
        int id = readPositiveInt("Enter student ID to update: ");
        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        student.setName(readRequiredText("Enter new name: "));
        student.setAge(readPositiveInt("Enter new age: "));
        student.setCourse(readRequiredText("Enter new course: "));

        System.out.println("Student updated successfully.");
    }

    private static void deleteStudent() {
        int id = readPositiveInt("Enter student ID to delete: ");
        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(student);
        System.out.println("Student deleted successfully.");
    }

    private static Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static int readPositiveInt(String message) {
        while (true) {
            int value = readInt(message);
            if (value > 0) {
                return value;
            }
            System.out.println("Please enter a number greater than 0.");
        }
    }

    private static String readRequiredText(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("This field cannot be empty.");
        }
    }
}
