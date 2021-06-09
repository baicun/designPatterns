package com.example.bridgePattern;

import com.example.bridgePattern.bridges.SharpTvControl;
import com.example.bridgePattern.bridges.SonyTvControl;
import com.example.bridgePattern.control.SharpControl;
import com.example.bridgePattern.control.SonyControl;


public class MainTest {
	public static void main(String[] args) {
		SonyTvControl mSonyTvControl;
		mSonyTvControl=new SonyTvControl(new SonyControl());
		mSonyTvControl.Onoff();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.Onoff();

		SharpTvControl mSharpTvControl;
		mSharpTvControl=new SharpTvControl(new SharpControl());
		mSharpTvControl.Onoff();
		mSharpTvControl.nextChannel();
		mSharpTvControl.setChannel(9);
		mSharpTvControl.setChannel(28);
		mSharpTvControl.Back();
		mSharpTvControl.Onoff();
		
	}
}
