package com.qa.test;

public class SkipingNumbers {

public static void main( String[] abc)	{
/*
 * 	
 */
	int start = 65;
	while(start <= 80) {
		if( start>= 74 && start<=76) {
			start++;
			continue;
		}
		System.out.println(start);
		start++;
	}
	
}
	
	
	
}
