package live.xiaoxu.design.pattern.adapter.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/23 上午 10:36
 */
public interface AdvancedMediaPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}