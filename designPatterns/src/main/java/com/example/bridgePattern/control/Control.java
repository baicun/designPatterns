package com.example.bridgePattern.control;

/**
 * @Description : 遥控器接口
 */
public interface Control {
	//开
	public void On();
	//关
	public void Off();
	//设置频道
	public void setChannel(int ch);
	//设置音量
	public void setVolume(int vol);

}
