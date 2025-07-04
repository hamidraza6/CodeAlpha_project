import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many scores
        System.out.print("Enter number of scores: ");
        int n = scanner.nextInt();

        int[] scores = new int[5];

        // Input scores
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Initialize highest and lowest with the first score
        int highest = scores[0];
        int lowest = scores[0];

        // Loop to find highest and lowest
        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // Output result
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}


        
              
    



