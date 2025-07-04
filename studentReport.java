import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class studentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter score of " + name + ": ");
            int score = sc.nextInt();
            sc.nextLine(); // consume newline

            students.add(new Student(name, score));
        }

        // Summary calculations
        int highest = students.get(0).score;
        int lowest = students.get(0).score;
        int total = 0;
        String topStudent = students.get(0).name;
        String lowStudent = students.get(0).name;

        for (Student s : students) {
            total += s.score;
            if (s.score > highest) {
                highest = s.score;
                topStudent = s.name;
            }
            if (s.score < lowest) {
                lowest = s.score;
                lowStudent = s.name;
            }
        }

        double average = (double) total / n;

        // Print report
        System.out.println("\n===== Student Summary Report =====");
        System.out.println("Name\t\tScore");
        System.out.println("-------------------------");
        for (Student s : students) {
            System.out.println(s.name + "\t\t" + s.score);
        }

        System.out.println("\nTotal students: " + n);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest + " (by " + topStudent + ")");
        System.out.println("Lowest score: " + lowest + " (by " + lowStudent + ")");
    }
}

