package structure.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playAvi(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放Mp4文件" + fileName);
    }
}
