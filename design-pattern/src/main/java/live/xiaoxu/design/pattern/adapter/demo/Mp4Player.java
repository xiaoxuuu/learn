package live.xiaoxu.design.pattern.adapter.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/23 上午 10:37
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}