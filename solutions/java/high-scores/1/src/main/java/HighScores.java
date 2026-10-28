import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HighScores {
    List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
        return this.scores.getLast();
    }

    Integer personalBest() {
        int pb = 0;
        for (int score: this.scores) {
            if (score > pb) {
                pb = score;
            }
        }
        return pb;
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>();
        for (int score: this.scores) {
            sortedScores.add(score);
        }
        Collections.sort(sortedScores);
        List<Integer> output = new ArrayList<>();
        if (sortedScores.size() - 1 >= 0) {
            output.add(sortedScores.get(sortedScores.size() - 1));
        }
         if (sortedScores.size() - 2 >= 0) {
             output.add(sortedScores.get(sortedScores.size() - 2));
         }
        if (sortedScores.size() - 3 >= 0) {
            output.add(sortedScores.get(sortedScores.size() - 3));
        }
        return output;
    }

}
