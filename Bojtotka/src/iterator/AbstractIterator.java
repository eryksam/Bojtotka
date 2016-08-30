package iterator;

import java.util.ListIterator;

public abstract class AbstractIterator<T> implements ListIterator<T>, Cloneable {
	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void set(T e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void add(T e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T previous() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public T last() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int lastIndex() {
		return 0;
	}
	
	public T first() {
		return null;
	}
	
	public void setNextIndex(int i) {
		
	}
	
}