package com.example.bridgePattern.bridges;

import com.example.bridgePattern.control.Control;

/**
 * @ClassName : SharpTvControl
 * @Description : 索尼遥控器
 */
public class SonyTvControl extends TvAbstractControlabs {
	private  int ch=0;
	private  boolean ison=false;
	
	public SonyTvControl(Control mControl)
	{
		super(mControl);
	}
	@Override
	public void Onoff() {
		if(ison)
		{
			ison=false;
			mControl.Off();
		}else{
			ison=true;
			mControl.On();
		}
	
	}

	@Override
	public void nextChannel() {
		ch++;
		mControl.setChannel(ch);
	
	}

	@Override
	public void preChannel() {
		ch--;
		if(ch<0)
		{
			ch=200;
		}
		mControl.setChannel(ch);
	
	}

}
