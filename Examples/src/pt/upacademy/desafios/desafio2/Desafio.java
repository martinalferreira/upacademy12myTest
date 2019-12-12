package pt.upacademy.desafios.desafio2;

public class Desafio {

	public static String order(String string) {
		
		String[] splitedWords = string.split(" ");
		StringBuilder result = new StringBuilder ("");
		
		for (int i = 0; i <= 9; i++) {
				for (String word : splitedWords) {
					if (word.contains(String.valueOf(i))) {
						result.append(word + " ");
					}
				}
		}
		return result.toString().trim();
	}
}
