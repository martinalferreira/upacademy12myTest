package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static int[] ints(String string) {
		
		if (string == "") {
			return new int[]{};
		}
		
		String[] splited = string.split(" ");
		List<Integer> resultList = new ArrayList<Integer>();
		
		for (int i = 0; i <= 9; i++) {
				for (String element : splited) {
					if (element.equals(String.valueOf(i))) {
						resultList.add(Integer.parseInt(element));
					}
				}
		}
		
		int[] resultArray = new int[resultList.size()];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = resultList.get(i);
		}
		return resultArray;
	}

}
