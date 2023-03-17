package com.yly.facade;

public class HomeFacade implements Functions {

    private TV tv;

    private Video video;

    public HomeFacade(TV tv, Video video) {
        this.tv = tv;
        this.video = video;
    }


    @Override
    public void play() {
        tv.play();
        video.play();
    }
}
