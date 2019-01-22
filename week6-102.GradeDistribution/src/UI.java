import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Scanner scanner;

    public UI() {
        this.scanner = new Scanner(System.in);
    }

    public ArrayList<Integer> getScores() {
        // create scores ArrayList
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        // loop getting scores
        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            // break if -1 is typed
            if (score == -1) {
                break;
            }
            // only add scores in range 0-60
            if (score >= 0 && score <= 60) {
                scores.add(score);
            }
        }
        // return scores to Grades class
        return scores;
    }

    public void printGrades(ArrayList<Integer> grades) {
        // initialize counter vars
        int fives = 0;
        int fours = 0;
        int threes = 0;
        int twos = 0;
        int ones = 0;
        int zeros = 0;
        // get number of grades to calculate acceptance percentage
        int numGrades = grades.size();
        // loop through grades to figure out num of each grade for printing
        for (Integer grade: grades) {
            if (grade == 5) {
                fives++;
            } else if (grade == 4){
                fours++;
            } else if (grade == 3) {
                threes++;
            } else if (grade == 2) {
                twos++;
            } else if (grade == 1) {
                ones++;
            } else {
                zeros++;
            }
        }
        // calculate acceptance percentage
        double acceptancePercentage = ((double)(fives + fours + threes + twos + ones) * 100) / numGrades;
        System.out.println("Grade distribution:");
        System.out.println("5: " + stars(fives));
        System.out.println("4: " + stars(fours));
        System.out.println("3: " + stars(threes));
        System.out.println("2: " + stars(twos));
        System.out.println("1: " + stars(ones));
        System.out.println("0: " + stars(zeros));
        System.out.println("Acceptance percentage: " + acceptancePercentage);
    }

    private String stars(int numStars) {
        String printStars = "";
        for (int i = numStars; i > 0; i--) {
            printStars += "*";
        }
        return printStars;
    }
}

