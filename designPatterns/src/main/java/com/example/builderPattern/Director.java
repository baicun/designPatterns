package com.example.builderPattern;

import com.example.builderPattern.builder.AbsBuilder;

public class Director {
	private AbsBuilder builder;
	
	public Director(AbsBuilder builder)
	{
		this.builder=builder;
	}
	public void setBuilder(AbsBuilder builder)
	{
		this.builder=builder;
	}
	public void construct()
	{
		builder.buildvacation();
		builder.getVacation().showInfo();
	}
}
