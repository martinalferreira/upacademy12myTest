package pt.upacademy.desafios.desafio3;

public class Desafio {

	public static int points(String[] strings) {
		
		int points = 0;
		
		for (String result : strings) {
			char[] resultArray = result.toCharArray();
			
			if (Integer.parseInt(String.valueOf(resultArray[0])) > Integer.parseInt(String.valueOf(resultArray[2]))) {
				points += 3;
			}
			else if (Integer.parseInt(String.valueOf(resultArray[0])) == Integer.parseInt(String.valueOf(resultArray[2]))) {
				points += 1;
			}
		}
		
		return points;
	}

}
