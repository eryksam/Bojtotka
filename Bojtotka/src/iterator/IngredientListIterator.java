package iterator;

import java.util.List;

public class IngredientListIterator<T> extends AbstractIterator<T> {

	public IngredientListIterator(List<T> list) {
		this.list = list;
		this.current = 0;
	}

	@Override
	public boolean hasNext() {
		return this.current < list.size();
	}

	@Override
	public T next() {
		return list.get(current++);
	}

	@Override
	public int nextIndex() {
		return this.current;
	}
	
	@Override
	public void setNextIndex(int i) {
		this.current = i;
	}

	@Override
	public boolean hasPrevious() {
		return (current-1) >= 0;
	}

	@Override
	public T previous() {
		return list.get(--current);
	}
	
	@Override
	public int previousIndex() {
		return current-1;
	}

	@Override
	public T last() {
		return list.get(list.size()-1);
	}

	@Override
	public int lastIndex() {
		return list.size()-1;
	}

	private List<T> list;
	private int current;
}
