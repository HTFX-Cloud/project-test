package com.training.java;

public interface CarService {
	public static void stop(Car car) {
		
	}
	
	public static void pick(Car car) {
		
	}
	
	default void method() {
		System.out.println("我是默认的");
	}
}
