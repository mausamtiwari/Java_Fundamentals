package be.intecbrussel.Projecten.Project1_MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;                 // Using MediaAdapter class.

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {    // If the audio type is mp3 then it is directly played.
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);         // if the audio type is vlc or mp4 then mediaAdapter object is created which uses AdvancedMediaPLayer interface.
            mediaAdapter.play(audioType, fileName);             // play method of MediaAdaptor object which is called.
        } else {                                                // If the audio type is none of the above, it is not supported.
            System.out.println("Invalid media ." + audioType + " format not supported.");
        }


    }
}
