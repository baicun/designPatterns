package com.example.commandPattern.device;

/**
 * @ClassName : Light
 * @Description : 灯
 * @Version V1.0
 */
public class Light {

    // 对灯的描述
    String loc = "";

    public Light(String loc) {
        this.loc = loc;
    }

    public void On() {

        System.out.println(loc + " On");
    }

    public void Off() {

        System.out.println(loc + " Off");
    }
}
