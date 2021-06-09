package com.example.bridgePattern.control;

/**
 * @Description : 底层夏普遥控器
 */
public class SharpControl implements Control {

	@Override
	public void On() {
		System.out.println("***Open Sharp TV***");
	}

	@Override
	public void Off() {
		System.out.println("***Off Sharp TV***");
	}

	@Override
	public void setChannel(int ch) {
		System.out.println("***The Sharp TV Channel is setted "+ch+"***");
	}

	@Override
	public void setVolume(int vol) {
		System.out.println("***The Sharp TV Volume is setted "+vol+"***");
	}

}
