package com.training.java;

public interface PackingService {

	public static void statistics(Car car) {
		StatisticsStrategery.TOTAL_FREE.statisics(car.getStatisicsType());
		StatisticsStrategery.TOTAL_USED.statisics(car.getStatisicsType());
	}
}
