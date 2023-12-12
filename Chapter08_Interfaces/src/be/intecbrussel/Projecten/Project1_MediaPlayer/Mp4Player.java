package be.intecbrussel.Projecten.Project1_MediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileNAme) {
        // empty
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name: " + filename);
    }
}
