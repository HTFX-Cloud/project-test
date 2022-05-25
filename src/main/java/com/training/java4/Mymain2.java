package com.training.java4;

public class Mymain2 {
	private static int index = 1;

    public void call(){

        index++;

        call();

    }

    public static void main(String[] args) {

    	Mymain2 mock = new Mymain2();

        try {

            mock.call();

        }catch (Throwable e){

            System.out.println("Stack deep : "+index);

            e.printStackTrace();

        }

    }
}
