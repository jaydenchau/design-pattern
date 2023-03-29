package com.nature.design.pattern.adapter;

import org.junit.Test;

/**
 * @author nature
 * @date 2020/10/16 16:09
 */
public class AdapterTest {

    @Test
    public void test() {
        MediaAdapter adapter = new MediaAdapter(new Mp3Player());
        adapter.playMusic();
        adapter.playVideo();
    }

}
