package com.training.java3;

import java.util.ArrayList;
import java.util.List;

import com.training.java2.Car;

public class PackingContext {
	private List<PackingListener> listeners;
	{
		listeners = new ArrayList<>();
	}
	public void registerEventListener(PackingListener listener) {
		listeners.add(listener);
	}
	public void stop(Car car) {
		publish(new PackingEvent(this, PackingEvent.Step.BEFORE_STOP, car));
		System.out.println("做一些事情");
		publish(new PackingEvent(this, PackingEvent.Step.AFTER_STOP, car));
	}
	public void pick(Car car) {
		publish(new PackingEvent(this, PackingEvent.Step.BEFORE_PICK, car));
		System.out.println("再来一些");
		publish(new PackingEvent(this,PackingEvent.Step.AFTER_PICK, car));
	}
	private void publish(PackingEvent e) {
		if(listeners == null || listeners.isEmpty()) {
			return;
		}
		for(PackingListener listener: listeners) {
			new Thread(()->listener.execute(e)).start();
		}
	}
}
