package com.training.java3;

import java.util.EventObject;

import com.training.java2.Car;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper  = false)
public class PackingEvent extends EventObject{
	public enum Step {BEFORE_STOP,AFTER_STOP,BEFORE_PICK,AFTER_PICK}
	private Car car;
	PackingEvent.Step step;
	/**
	 * 
	 */
	private static final long serialVersionUID = 218153901956651500L;
	public PackingEvent(Object source) {
		super(source);
	}
	public PackingEvent(Object source,PackingEvent.Step step,Car car) {
		super(source);
		this.car=car;
		this.step = step;
	}
}
