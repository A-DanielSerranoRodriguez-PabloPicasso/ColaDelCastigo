package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Queue;

import models.CompararInt;

public class ColaDelCastigo<T> implements Queue<T>, Comparator<T> {
	ArrayList<T> coleccion;
	Comparator<Integer> compar;

	public ColaDelCastigo(CompararInt compararInt) {
		this.coleccion = new ArrayList<T>();
		this.compar = compararInt;
	}

	@Override
	public int size() {
		return coleccion.size();
	}

	@Override
	public boolean isEmpty() {
		return coleccion.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return coleccion.contains(o);
	}

	@Override
	public Iterator iterator() {
		return coleccion.iterator();
	}

	@Override
	public Object[] toArray() {
		return coleccion.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		return coleccion.remove(o);
	}

	@Override
	public boolean containsAll(Collection c) {
		return coleccion.containsAll(c);
	}

	@Override
	public boolean addAll(Collection c) {
		return coleccion.addAll(c);
	}

	@Override
	public boolean removeAll(Collection c) {
		return coleccion.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection c) {
		return coleccion.retainAll(c);
	}

	@Override
	public void clear() {
		coleccion.clear();
	}

	@Override
	public boolean add(T e) {
		if (coleccion.size() < 10)
			return coleccion.add(e);
		else
			return false;
	}

	@Override
	public boolean offer(T e) {
		return add(e);
	}

	@Override
	public T remove() {
		// TODO devolver excepcion
		T col = coleccion.get(0);
		coleccion.remove(0);
		return col;
	}

	@Override
	public T poll() {
		T col = coleccion.get(0);
		coleccion.remove(0);
		return col;
	}

	@Override
	public T element() {
		// TODO devolver excepcion
		return coleccion.get(0);
	}

	@Override
	public T peek() {
		return coleccion.get(0);
	}

	public int compare(int o1, int o2) {
		return o1 - o2;
	}

	public int compare(long o1, long o2) {
		return (int) (o1 - o2);
	}

	public int compare(double o1, double o2) {
		return (int) (o1 - o2);
	}

	public int compare(float o1, float o2) {
		return (int) (o1 - o2);
	}

	public int compare(String o1, String o2) {
		return o1.compareToIgnoreCase(o2);
	}

	public int compare(char o1, char o2) {
		return o1 - o2;
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
