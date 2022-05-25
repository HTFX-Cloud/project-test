package com.training.java2;

public class Mymain {
public static void main(String[] args) {
	PackingObservable observable = new PackingObservable();
	observable.login(new Car("asd"));
	//
	observable.addObserver(new StopSubject());
	observable.addObserver(new PickSubject());
	
}
}
