package com.example.statePattern;

public interface State {
	//塞入硬币
	public void insertCoin();
	//返回硬币
	public void returnCoin();
	//转动把手
	public void turnCrank();
	//分发
	public void dispense();
	//当前状态
	public void printstate();
}
