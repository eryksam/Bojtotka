package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import iterator.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program has started!");
		long runtime = System.currentTimeMillis()/1000;
		
		if (!requiredArgumentsGiven(args.length)) {
			System.out.println("Argument not given!");
			System.exit(-1);
		}
		
		AbstractIterator<Character> iterator;
		Bojtotka<Character> bojtotka;
		try {
			iterator = new IngredientListIterator<>(toCharacterArray(readIngredientsFromFile(args[0])));
			bojtotka = new Bojtotka<>(iterator);
			System.out.println(bojtotka.maxIngredients());
		} catch (FileNotFoundException exception) {
			System.out.println("File " + args[0] + " not found!");
			System.exit(1);
		}
		runtime = System.currentTimeMillis()/1000 - runtime;
		System.out.println("Program terminated successfully! Execution time: " + runtime + "s");
	}

	private static boolean requiredArgumentsGiven(int numberOfArgs) {
		return numberOfArgs > 0;
	}

	private static List<Character> toCharacterArray(String string) {
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < string.length(); i++) {
			list.add(string.charAt(i));
		}

		return list;
	}

	private static String readIngredientsFromFile(String filePath) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File(filePath));
		String ingredients = fileReader.next();
		ingredients = fileReader.next();
		while(ingredients.charAt(0) >= '0' && ingredients.charAt(0) <= '9')
			ingredients = ingredients.substring(1, ingredients.length());
		fileReader.close();
		return ingredients;
	}

}
