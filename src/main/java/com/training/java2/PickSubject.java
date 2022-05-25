package com.training.java2;

import java.util.Observable;
import java.util.Observer;

public class PickSubject implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(Car.class.isInstance(arg)) {
			System.out.println(String.format("取车，车牌号是：%s", ((Car)arg).getCarNumber()));
		}
	
	}

}
