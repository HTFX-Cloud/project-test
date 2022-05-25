package com.training.java3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import com.training.java2.Car;

import cn.hutool.core.map.MapUtil;

public class Mymain {
	static Map<PackingEvent.Step, Consumer<Car>> DRIVER = MapUtil.<PackingEvent.Step, Consumer<Car>> builder()
			.put(PackingEvent.Step.BEFORE_PICK,Mymain::show)
			.put(PackingEvent.Step.AFTER_PICK,Mymain::show)
			.put(PackingEvent.Step.BEFORE_STOP,Mymain::show)
			.put(PackingEvent.Step.AFTER_STOP,Mymain::show)
			.build();
			public static void show(Car car) {
				System.out.println(String.format("车牌号是：%s",car.getCarNumber()));
			}
	public static void main(String[] args) {
		PackingContext context = new PackingContext();
		context.registerEventListener(new PackingListener() {
			@Override
			public void execute(PackingEvent e) {
			Car car  = 	e.getCar();
			DRIVER.get(e.getStep()).accept(car);
			}
		});
		context.pick(new Car("asdasd"));
	}
}
