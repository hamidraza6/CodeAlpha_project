import java.util.Scanner;

public class managedata{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many scores? ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}

