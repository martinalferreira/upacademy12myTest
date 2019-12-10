package io.altar.jseproject.textinterface.ScannerUtils;

import java.util.Scanner;

public class ScannerUtils {
	Scanner sc = new Scanner(System.in);
	
	public String getValue(String message) {
		System.out.println(message);
		String result = sc.nextLine();
		return result;
	}
	
	public int getInt(String message) {
		while (true) {
			String value = getValue(message);
			Scanner sc2 = new Scanner(value);
			if (sc2.hasNextInt()) {
				return sc2.nextInt();
			} else {
				sc2.nextLine();
			}
			sc2.close();
		}
	}
	
	public int getValidInt(String message, int[] values) {
		boolean verify = false;
		int validInt = 0;
		while(!verify) {
			validInt = getInt(message);
			for (int i = 0; i < values.length; i++) {
				if(values[i]== validInt) {
					verify = true;
				}
			}
		}
		return validInt;
	}
	
	public int getValidInt(String message, int min, int max) {
		int validInt;
		do {
			validInt = getInt(message);
		} while(min > validInt || validInt > max);
		return validInt;
	}
	
}
