package com.training.java2;

import java.util.Observable;
import java.util.Observer;

public class StopSubject implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("停车"+o+"====="+arg);
	}
}
