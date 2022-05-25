package com.training.java;

public enum StatisticsStrategery {
	TOTAL_USED(){

		@Override
		public void statisics(StatisicsType type) {
			// TODO Auto-generated method stub
			
		}
		
	},
	TOTAL_FREE(){

		@Override
		public void statisics(StatisicsType type) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	public abstract void statisics(StatisicsType type);
}
