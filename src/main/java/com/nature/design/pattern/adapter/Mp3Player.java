package com.nature.design.pattern.adapter;

/**
 * @author nature
 * @date 2021/3/24 10:17
 */
public class Mp3Player implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("正在播放mp3.....");
    }
}
