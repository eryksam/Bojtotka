package main;

import iterator.*;
import salad.Ingredients;

public class Bojtotka<T> {
	public Bojtotka(AbstractIterator<T> iterator) {
		this.iterator = iterator;
	}

	public int maxIngredients() {
		int max = 0;
		while (iterator.hasNext()) {
			int tmp = makeSalad();
			max = Math.max(tmp, max);
		}
		return max;
	}

	private int makeSalad() {
		int balance = 0;
		int next = 0;
		int leftBound = iterator.lastIndex();
		int result = 0;
		boolean x = false;

		while (iterator.hasNext()) {
			if (isOrange(iterator.next())) {
				balance = 1;
				result = 1;
				leftBound = iterator.previousIndex();
				break;
			}
		}
		while (iterator.hasNext() && balance >= 0) {
			T ingredient = iterator.next();
			if (isOrange(ingredient)) {
				if(!x) {
					x = true;
					next = iterator.previousIndex();
				}
				balance++;
				continue;
			}
			
			balance--;
		}

		balance = 0;
		while (iterator.previousIndex() >= leftBound) {
			T item = iterator.previous();
			if (isOrange(item)) {
				balance++;
			} else if (--balance < 0) {
				balance = 0;
				result = 0;
				continue;
			}
			result++;
		}
		if (x)
			iterator.setNextIndex(next);
		else {
			iterator.next();
			while(iterator.hasNext()) {
				if(isOrange(iterator.next())) {
					iterator.setNextIndex(iterator.previousIndex());
					break;
				}
			}
		}
			
		return result;
	}

	private boolean isOrange(T ingredient) {
		return ((Character) ingredient).compareTo(Ingredients.ORANGE) == 0;
	}

	private AbstractIterator<T> iterator;
}
