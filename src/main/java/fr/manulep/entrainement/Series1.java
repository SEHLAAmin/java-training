package fr.manulep.entrainement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory.Result;

import com.google.common.primitives.Chars;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.invoke.StringConcatFactory;


public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// 1

		if ((name == null) || (name == "")) {
			return "Hello World";
		} else
			return "Hello " + name;
	}

	public static String[] removeNullElements(String[] array) {
		// 2
		String[] sortie;

		int cpt = array.length;
		for (String value : array) {
			if (value == null) {
				cpt--;
			}
		}

		sortie = new String[cpt];
		int x = 0;
		for (String value : array) {
			if (value != null) {
				sortie[x] = value;
				x++;
			}

		}
		return sortie;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		// capacité
		int[] tab1;
		if (array.length > 0) {
			tab1 = new int[array.length + 1];

		} else {
			tab1 = new int[1];

		}
		// valeur
		for (int i = 0; i < tab1.length; i++) {
			if (i == 0) {
				tab1[i] = element;
			} else {
				tab1[i] = array[i - 1];

			}

		}
		return tab1;
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4
		List<Integer> memory = new ArrayList<>();
		for ( int i = 3; i < array.length; i++){
				memory.add(array[i]);
			}
		int[] result = new int[memory.size()] ;

			for (int i = 0; i < result.length; i++){
				result[i] = memory.get(i);
			}

		return result ;

	}

	public static String getFirstHalf(String word) {
		// 5
		String a = "";
		a = word.substring(0, 3);
		return a;
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6
		// version arrayList
		String[] retour;
		ArrayList<String> stock = new ArrayList<String>();
		for (String mot : array) {
			if (mot.charAt(0) == 'a') {
				stock.add(mot);
			}

		}
		retour = stock.toArray(new String[stock.size()]);
		return retour;
		// int x=0;
		// retour = new String[stock.size()];
		// for (String mot : stock){
		// retour[x] = mot;
		// x++;

		/*
		 * int nb = 0; for( String elem : array){ if(elem.charAt(0) == 'a'){ nb = nb+1;
		 * System.out.println(); }mots = new String[nb]; }
		 */

		/*
		 * String[] mots; int x= 0; for(int = 0 ; i < array.length ; i++){ String elem =
		 * array[i]; if(elem.charAt(0) == 'a'){ mots[x] = elem; x++; } }
		 */

	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		// : a, ɑ, e, ɛ, i, o, ɔ, u, y,
		String[] voyel;
		int x = 0;
		for (String elem : array) {
			if (elem != null) {
				if (elem.charAt(0) == 'a' || elem.charAt(0) == 'ɑ' || elem.charAt(0) == 'e' || elem.charAt(0) == 'i'
						|| elem.charAt(0) == 'o' || elem.charAt(0) == 'ɔ' || elem.charAt(0) == 'u'
						|| elem.charAt(0) == 'y') {

					x++; // capacité
				}
			}

		}
		voyel = new String[x];

		int j = 0;
		for (String elem : array) {
			if (elem != null) {
				if (elem.charAt(0) == 'a' || elem.charAt(0) == 'ɑ' || elem.charAt(0) == 'e' || elem.charAt(0) == 'i'
						|| elem.charAt(0) == 'o' || elem.charAt(0) == 'ɔ' || elem.charAt(0) == 'u'
						|| elem.charAt(0) == 'y') {

					voyel[j] = elem;
					j++;
				}
			}
			
		}
		return voyel;
	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		String [] reverse = new String [array.length];
		int j = array.length-1;
		for ( int i = 0 ; i < array.length ; i++ ) {
			 reverse[i] = array[j];
			 j--;
		}return reverse ;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9
		
		List<Integer> listClone = new ArrayList<>();
		for (int num : array){
			listClone.add(num);
		}
		int middleArray = Math.round(array.length/2);
				listClone.add(middleArray, element);
		int [] newArray = new int[listClone.size()];
		for (int i = 0 ; i < newArray.length; i++){
			newArray[i] = listClone.get(i);
		}

		return newArray;
	}

	public static String shortestWord(String text) {
		// 10
		int longueur = 100; // filets de pêches
		String shortestWord = ""; // place pour le plus petit des mots
		String[] mots= text.split(" ");  // séparation
		for( String mot : mots){
			if( mot.length() < longueur){
				longueur = mot.length() ; //la nouvelle longueur du mots qui a était trouver en permier est la nouvelle réference ainsi  de suite
				shortestWord = mot;
				
			}
				}
		return shortestWord;
	}

	public static String removeCapitals(String text) {
		// 11
		// on déclare une string vide 
		String notCapital= ""; 
		// on boucle sur la longueur de notre var text pour tte la parcourir
		for (int i = 0; i < text.length(); i++) {
			// notre char letter recupere les infos de notre var text en fonction de ses index
			char letter = text.charAt(i);
			if(!Character.isUpperCase(letter)){ // si letter à l'inverse d'une majuscule dans ses index
				notCapital += letter; // alors notCapital prend la valeur de letter
			}
		}
		return notCapital; // ça nous à donc garder que les minuscules 
	}
	

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		return number1 + number2;

	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		long calc = 0;
		for (int i = 0; i < numbers.length; i++) {
			calc += numbers[i];
		}
		return calc;

	}

	public static float makeNegative(float number) {
		// 15
		float a = number;
		if (a > 0) {
			a = a * (-1);
		} else {
			return a;
		}
		return a;

	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16
		
		
		Pattern special = Pattern.compile("[@#$%&*()_+=|<>?{}\\[\\]~-]");
		Matcher hasSpecial = special.matcher(string);


		return hasSpecial.find();


	}
	public static void main(String[] args) {

		


	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		//C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Z
		String firstChar = String.valueOf(word.charAt(0));

		Pattern consonant = Pattern.compile("[zrtypqsdfghjklmwxcvbn]", Pattern.CASE_INSENSITIVE);
		Matcher hasconsonant = consonant.matcher(firstChar);

		return hasconsonant.find();
	}

	public static String getDomainName(String email) {
		// 18
		String [] split = email.split(".com");
		split = split[0].split("@");

		return split[1];
	}

	public static int[] letterPosition(String name) {
		// 19

		String lowerCaseName = name.toLowerCase();
		char [] alphabet = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] letterPosition = new int[lowerCaseName.length()];
		for (int i = 0; i < lowerCaseName.length(); i++ ){
			char target = lowerCaseName.charAt(i);
			int index = Chars.indexOf(alphabet,target);
			letterPosition[i] = index;
		}
		return letterPosition;
	
	}

	public static boolean isPeer(int number) {
		// 20
		float halfNumber = (float) number / 2;
		if(halfNumber == Math.floor(halfNumber)){
			return true;
		} else {
			return false;
		}
	}

}
