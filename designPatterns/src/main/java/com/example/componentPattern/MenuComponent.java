package com.example.componentPattern;

import java.util.Iterator;
//容器类
public abstract class MenuComponent {

	public String getName() {
		return "";
	}

	public String getDescription() {
		return "";
	}

	public float getPrice() {
		return 0;
	}

	public boolean isVegetable() {
		return false;
	}

	public abstract void print();

	public Iterator getIterator() {
		return new NullIterator();
	}
}
