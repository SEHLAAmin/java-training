package fr.manulep.entrainement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Series2 {

	private Series2() {
		throw new IllegalStateException("Test class");
	}

	public static List<String> selectElementsFromListStartingWithA(List<String> elements) {
		return new ArrayList<>();
	}

	public static List<String> sortByLastLetter(List<String> names) {
		return new ArrayList<>();
	}

	public static String exportWordsWithoutALetter(List<String> names, char letter) {
		return "";
	}

	public static String getAllLetters(List<String> words) {
		return "";
	}

	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {
		return new ArrayList<>();
	}

	public static List<Integer> exportPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> exportSortPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> allElementsExceptFirstAndLast(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> reverseOrder(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static int numberOfPalindromeWord(String text) {
		return 100;
	}

	public static String longestWord(String text) {
		int length = 100; // filet de peche pour prendre tt les mots possible
		String[] mots = text.split(" "); // permet de mettre "winter is coming" dans un array avec un index chacun,
											// (winter =0 etc...), important de mettre " " (l'espace) pour pas que les
											// mots soient collés
		String shortestWord = ""; // on initialise pour pas que java gueule

		
		for (String word : mots) {
			if (word.length() > length) { // On compare la longueur de nos mots (winter, is...) par rapport à l'int
				if(word.charAt() == "birds," ){
					mots = null;
				}
			length++;	
				length = word.length(); /*
										 * notre filet "length" prend la valeur de la longueur du word, donc length=100
										 * devient length=6 (winter), puis second tour, on compare la longueur de notre
										 * word.lenght (is) comparé à celle de length, et donc is de vient notre + petit
										 * mot etc...
										 */
				shortestWord = word; // on stock notre + petit mot dans notre shortestWord
			}
		}
		return shortestWord;
	}


	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}

	public static List<String> findAnagrams(String name) {
		return null;
	}

	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}

	public static boolean isPeerSum(final int... numbers) {
		return false;
	}

	public static boolean isRightTriangle(int side1, int side2, int side3) {
		return false;
	}

	public static boolean isOrder(int... number) {
		return false;
	}

	public static Float intToFloat(int number) {
		return null;
	}

	public static Integer floatToInt(float number) {
		return null;
	}

	public static String dateToString(LocalDate date, String format) {
		return null;
	}

}
