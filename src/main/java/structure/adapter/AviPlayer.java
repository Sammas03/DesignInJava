package structure.adapter;

public class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playAvi(String fileName) {
        System.out.println("播放Avi格式文件" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放");
    }
}
