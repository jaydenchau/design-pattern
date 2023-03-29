package com.nature.design.pattern.adapter;

/**
 * @author nature
 * @date 2021/3/24 10:17
 */
public class MediaAdapter implements Media {

    private Mp3Player mp3Player;

    public MediaAdapter(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void playMusic() {
        mp3Player.playMusic();
    }

    @Override
    public void playVideo() {
        System.out.println("正在播放视频.....");
    }
}
