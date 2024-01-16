package structure.adapter;

public class AudioPlayer implements MediaPlayer{

    private MediaPlayerAdapter mediaPlayerAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放mp3" + fileName);
        }else {
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType,fileName);
        }
    }
}
