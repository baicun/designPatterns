package com.example.fyweightPattern;

import java.util.HashMap;

//享元工厂类
public class PlantFactory {

	//定义一个HashMap用于存储享元对象，实现享元池
	private HashMap<Integer, Plant> plantMap = new HashMap<Integer, Plant>();

	public PlantFactory() {

	}

	public Plant getPlant(int type) {

		if (!plantMap.containsKey(type)) {

			switch (type) {
			case 0:
				plantMap.put(0, new Tree());
				break;
			case 1:
				plantMap.put(1, new Grass());
				break;
			}
		}
		return plantMap.get(type);
	}
}
