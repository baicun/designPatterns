package com.example.bridgePattern.bridges;

import com.example.bridgePattern.control.Control;

public abstract class TvAbstractControlabs {

	Control mControl=null;
	public TvAbstractControlabs(Control mControl)
	{
		this.mControl=mControl;
	}
	//开/关
	public abstract void Onoff();
	//下一个频道
	public abstract void nextChannel();
	//上一个频道
	public abstract void preChannel();
	
	
}
