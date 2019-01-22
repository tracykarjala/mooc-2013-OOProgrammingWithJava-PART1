import java.util.ArrayList;

public class Grades {
    private UI ui;
    private ArrayList<Integer> scores;
    private ArrayList<Integer> grades;

    public Grades() {
        this.ui = new UI();
        this.scores = ui.getScores();
        this.grades = new ArrayList<Integer>();
        calcGrades();
    }

    private void calcGrades() {
        for (int points: scores) {
            if (points >= 50) {
                grades.add(5);
            } else if (points > 44) {
                grades.add(4);
            } else if (points > 39) {
                grades.add(3);
            } else if (points > 34) {
                grades.add(2);
            } else if (points > 29) {
                grades.add(1);
            } else {
                grades.add(0);
            }
        }
        ui.printGrades(grades);
    }
}
