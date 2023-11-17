package be.intecbrussel.StudentInfo;

public class ScoreInfo {
    Student student;
    int score;

    public ScoreInfo(int score, Student student) {     // All args constructor
        this.score = score;
        this.student = student;
    }

    public Student getStudent() {        // Student getter
        return student;
    }

    public int getScore() {              // Score getter
        return score;
    }

    @Override
    public String toString() {
        return "ScoreInfo{" +
                "student=" + student +
                ", score=" + score +
                '}';
    }

}
