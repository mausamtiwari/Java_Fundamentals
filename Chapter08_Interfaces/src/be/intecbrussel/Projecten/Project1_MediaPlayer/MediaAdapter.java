package be.intecbrussel.Projecten.Project1_MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;    // Using AdvancedMediaPLayer interface.

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {    // If audiotype is vlc, instance of VlcPlayer class is created which is implemented from AdvancedMediaPLayer Interface
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {  // if audiotype is mp4, instance of Mp4Player class is created which is implemented from AdvancedMediaPlayer Interface.
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);      // If audio type is vlc, playVlc method is invoked from advancedMediaPlayer class which is implemented by VlcPlayer class containing playVlc() method.
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);       // If audi type is mp4, playMp4 method is invoked from advancedMediaplayer class which is implemented by Mp4Player class containing  playMp4() method.
        }
    }
}
