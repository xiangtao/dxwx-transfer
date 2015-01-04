package com.axj.apiw.util;

public class RandomUtil {
	public static int getRandomData(int max){
		int data = (int)(Math.random()*max);
		return data;
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomData(5));
	}
}
