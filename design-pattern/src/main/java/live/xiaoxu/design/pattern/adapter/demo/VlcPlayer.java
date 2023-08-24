package live.xiaoxu.design.pattern.adapter.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/23 上午 10:37
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}