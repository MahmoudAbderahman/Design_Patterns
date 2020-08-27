package com.mahmoud.factory;

import java.util.Calendar;

public class FactoryEverydayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		/*

		 * gets dumped out from that System.out.println, so the Gregorian calendar is the actual concrete implementation
		 * that is being called underneath this factory instance. 
		 */
		System.out.println(cal);
	
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

	}

}
