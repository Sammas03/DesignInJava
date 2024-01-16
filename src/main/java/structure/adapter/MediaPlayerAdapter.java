package structure.adapter;

public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("Avi")){
            advancedMediaPlayer = new AviPlayer();
        }
        else {
            advancedMediaPlayer = new Mp4Player();

        }
    }

    @Override
    public void play(String audioType, String fileName) {
        // 判断当前的格式为Avi还是Mp4
        if(audioType.equalsIgnoreCase("Avi")){
            advancedMediaPlayer.playAvi(fileName);
        }else {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
