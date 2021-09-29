package pack1;

public class Aeiou {

static String s="mouli";
static String m="klqwmnb";
	public static void main(String[] args) {

		System.out.println(vowels(s)); 
		System.out.println(vowels(m)); 

	}

	public static boolean vowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}
}
