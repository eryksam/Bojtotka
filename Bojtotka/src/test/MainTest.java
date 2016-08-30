package test;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.FilePathMap;
import main.Main;

public class MainTest {
	Main instance;
	FilePathMap fileMap;
	
	public MainTest() {
		this.instance = new Main();
		fileMap = FilePathMap.getSingleton();
	}
	
	@Test
	public void requiredArgumentsGivenTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<Method> testNumberList = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Class<Integer> [] args = new Class[1];
		args[0] = Integer.TYPE;
		
		for(int i = -2; i <= 2; i++) {
			Method tmp = instance.getClass().getDeclaredMethod("requiredArgumentsGiven", args);
			tmp.setAccessible(true);
			testNumberList.add(tmp);
		}
		
		for(int i = 0; i < testNumberList.size(); i++) {
			if(i > 0) {
				assertEquals(true, testNumberList.get(i).invoke(instance, i));
			}
		}
		
	}

	@Test
	public void toCharacterArrayTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		@SuppressWarnings("unchecked")
		Class<String> [] args = new Class[1];
		String testString = "This is string created for testing!!!";
		args[0] = String.class;
		Method tmp = instance.getClass().getDeclaredMethod("toCharacterArray", args);
		tmp.setAccessible(true);
		@SuppressWarnings("unchecked")
		List<Character> list = (List<Character>) tmp.invoke(instance, testString);
		
		for(int i = 0; i < testString.length(); i++) {
			assertEquals(testString.charAt(i), list.get(i).charValue());
		}
	}

	@Test
	public void readIngredientsFromFileTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = instance.getClass().getDeclaredMethod("readIngredientsFromFile", String.class);
		method.setAccessible(true);
		String testString = "jpjppj";
		String testString1f = "jjjjjjjpjpjpjpppppppp";
		assertEquals(testString, method.invoke(instance, fileMap.getInputFilePath("bar0")));
		assertEquals(testString1f, method.invoke(instance, fileMap.getInputFilePath("bar1f")));
	}

}
