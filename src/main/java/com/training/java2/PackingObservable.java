package com.training.java2;

import java.util.Observable;

public class PackingObservable extends Observable{
	public void login(Car car) {
		checkCar(car);
		if(saveCache(car)) {
			super.setChanged();
			super.notifyObservers(car);
		}
		
	}
	public void checkCar(Car car) {
		//数据对象校验
	}
	public boolean saveCache(Car car) {
		return true;
	}
}
