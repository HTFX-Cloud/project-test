package com.training.java3;

import java.util.EventListener;

public interface PackingListener extends EventListener{
	public void execute(PackingEvent e);
}
