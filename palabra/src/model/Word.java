package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Word {

	private ArrayList<Character> terminals;
	private ArrayList<Character> nonTerminals;
	private ArrayList<String> productions;
	private String word;

	public Word(String word) {
		this.terminals = new ArrayList<>();
		this.nonTerminals = new ArrayList<>();
		this.productions = new ArrayList<>();
		terminals.add('a');
		this.word = word;
		verifyWord();
	}

	public void verifyWord() {
		if (!isLower(word)) {
			System.out.println("La palabra debe contener solo simbolos terminales");
		} else {
			for (int i = 0; i < word.toCharArray().length; i++) {
				for (int j = 0; j < terminals.size(); j++) {
					if (terminals.get(j) == word.toCharArray()[i])
						j = terminals.size() + 1;
					else {
						System.out.println("simbolo en palabra no pertenece a la gramática");
						return;
					}
				}
			}
			System.out.println("todos los simbolos de la palabra pertenecen al lenguaje");
			return;
		}
	}

	public static boolean isLower(String s) {
		return s.equals(s.toLowerCase());
	}

	public static void main(String[] args) {
		System.out.println("ingrese una palabra");
		Scanner scanner = new Scanner(System.in);
		new Word(scanner.nextLine());
	}
}
