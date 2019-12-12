package pt.upacademy.desafios.desafio4;

public class Desafio {

	public static int[] ints(String string) {
		
		String[] splited = string.split(" ");
		Integer result = new Integer[];
		
		for (int i = 0; i <= 9; i++) {
				for (String index : splited) {
					if (index.contains(String.valueOf(i))) {
						result.add(Integer.parseInt(index + ","));
					}
				}
		}
		
		return result;
	}

}
