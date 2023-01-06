package live.xiaoxu.design.pattern.adapter;

import live.xiaoxu.design.pattern.adapter.demo.AudioPlayer;

/**
 * @author Xiao Xu
 * @date 2021/9/23 上午 10:38
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}