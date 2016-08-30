package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import iterator.AbstractIterator;
import iterator.IngredientListIterator;

public class IngredientListIteratorTest {

	AbstractIterator<Integer> iterator;
	
	public IngredientListIteratorTest() {
		initializeIterator();
	}

	private void initializeIterator() {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0)
			 list.add(-i);
			else list.add(i);
		}
		this.iterator = new IngredientListIterator<>(list);
	}

	@Test
	public void test() {
		assertEquals(0, iterator.nextIndex());
		assertEquals(-1, iterator.previousIndex());
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		assertEquals(10, iterator.nextIndex());
		assertEquals(9, iterator.previousIndex());
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous() + " ");
		}
		assertEquals(0, iterator.nextIndex());
		assertEquals(-1, iterator.previousIndex());
	}

}
