package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import iterator.AbstractIterator;
import iterator.IngredientListIterator;
import main.Bojtotka;
import main.FilePathMap;
import main.Main;
import salad.Ingredients;

public class BojtotkaTest {
	private Bojtotka<Character> Bojtotkainstance;
	private final String testString = "This is sample string!!!";
	private FilePathMap fileMap;
	private List<String> fileNameList;
	
	public BojtotkaTest() {
		initializeBojtotka();
		initializeFileNameList();
		fileMap = FilePathMap.getSingleton();
	}

	private void initializeFileNameList() {
		fileNameList = new ArrayList<>();
		fileNameList.add("bar0");
		fileNameList.add("bar1a");
		fileNameList.add("bar1b");
		fileNameList.add("bar1c");
		fileNameList.add("bar1d");
		fileNameList.add("bar1e");
		fileNameList.add("bar1f");
		fileNameList.add("bar1g");
		fileNameList.add("bar2a");
		fileNameList.add("bar2b");
		fileNameList.add("bar2c");
		fileNameList.add("bar3a");
		fileNameList.add("bar3b");
		fileNameList.add("bar3c");
		fileNameList.add("bar3d");
		fileNameList.add("bar4a");
		fileNameList.add("bar4b");
		fileNameList.add("bar4c");
		fileNameList.add("bar5a");
		fileNameList.add("bar5b");
		fileNameList.add("bar5c");
		fileNameList.add("bar6a");
		fileNameList.add("bar6b");
		fileNameList.add("bar6c");
		fileNameList.add("bar7a");
		fileNameList.add("bar7b");
		fileNameList.add("bar7c");
		fileNameList.add("bar7d");
		fileNameList.add("bar8a");
		fileNameList.add("bar8b");
		fileNameList.add("bar8c");
		fileNameList.add("bar9a");
		fileNameList.add("bar9b");
		fileNameList.add("bar9c");
		fileNameList.add("bar9d");
		fileNameList.add("bar10a");
		fileNameList.add("bar10b");
		fileNameList.add("bar10c");
		
	}

	private void initializeBojtotka() {
		List<Character> list = new ArrayList<>();
		for(int i = 0; i < testString.length(); i++) {
			list.add(testString.charAt(i));
		}
		AbstractIterator<Character> iterator = new IngredientListIterator<>(list);
		Bojtotkainstance = new Bojtotka<>(iterator);
	}

	public void maxIngredientsTest() throws FileNotFoundException {
		System.out.println("maxIngredients");
		// TODO Auto-generated method stub
	}
	
	public void makeSaladTest() throws NoSuchMethodException, SecurityException {
		System.out.println("makeSalad");
		// TODO Auto-generated method stub
		
	}

	
	
	@Test
	public void isOrangeTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("isOrangeTest");
		Method method = Bojtotkainstance.getClass().getDeclaredMethod("isOrange", Object.class);
		method.setAccessible(true);
		for(int i = 0; i < testString.length(); i++) {
			if(testString.charAt(i) == Ingredients.ORANGE) {
				assertEquals(true, method.invoke(Bojtotkainstance, testString.charAt(i)));
			}
			else {
				assertEquals(false, method.invoke(Bojtotkainstance, testString.charAt(i)));
			}
		}
	}

}
