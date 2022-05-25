package com.training.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.lang.Validator;

public class JavaProjectMain {
	public static void main(String[] args) {
		template();
	}
	public static Map<String, Consumer<Car>> driver = new HashMap<>();
	static {
		driver.put("步骤1",CarService::stop );
		driver.put("步骤2",CarService::pick );
		driver.put("步骤3",PackingService::statistics );
	}
	
	public static void template() {
		Optional.of("asd").ifPresent(t->System.out.println(t));
		System.out.println("******************************************\r\n" + 
				"**欢迎使用XXX停车场管理系统，请根据提示选择您所使用的功能**\r\n" + 
				"******************************************");
		try (Scanner in = new Scanner(System.in)) {
			String op = in.next();
			check(op);
			driver.get(op).accept(new Car("车牌号",new StatisicsType()));
		}
	}
	public static void check(String op) {
		//对输入内容校验。异常驱动输出
		Assert.notBlank(op,()-> new NullPointerException("请保证填写的内容不为空"));
		Validator.validateCitizenIdNumber(op, "请保证格式正确");
	}
}
