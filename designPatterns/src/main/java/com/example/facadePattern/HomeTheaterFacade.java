package com.example.facadePattern;

/**
 * @ClassName : HomeTheaterFacade
 * @Description : 智能家庭设备控制
 * @Version V1.0
 */
public class HomeTheaterFacade {
    private Stereo mStereo;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(){
        this.mStereo = Stereo.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //开启设备
    public void ready() {
        mStereo.on();
        dvdPlayer.on();
    }

    //关闭设备
    public void end() {
        mStereo.off();
        dvdPlayer.off();
    }

    //设备运转
    public void play(){
        dvdPlayer.play();
    }

    //dvd暂停
    public void pause(){
        dvdPlayer.pause();
    }

}
