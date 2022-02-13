package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import exceptions.ColaExceededSizeException;
import exceptions.ElementBlockedException;
import exceptions.LlevateTuNullDeAquiExcepcion;

public class ColaDelCastigo<T> {
	/**
	 * This collection uses ArrayList<T> to manage the objects.
	 */
	ArrayList<T> collection;
	/**
	 * Comparator that will keep the collection sorted. Has to be of the same object that the collection.
	 */
	Comparator<T> comparar;

	/**
	 * Constructor of the collection.
	 * @param compare Comparator that will be used.
	 */
	public ColaDelCastigo(Comparator<T> compare) {
		this.collection = new ArrayList<T>();
		this.comparar = compare;
	}

	public int size() {
		return collection.size();
	}

	public T get(int i) {
		return collection.get(i);
	}

	public boolean isEmpty() {
		return collection.isEmpty();
	}

	public boolean contains(Object o) {
		return collection.contains(o);
	}

	public Iterator<T> iterator() {
		return collection.iterator();
	}

	public Object[] toArray() {
		return collection.toArray();
	}

	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		return collection.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return collection.containsAll(c);
	}

	public boolean removeAll(Collection<?> c) throws Exception {
		if (c.size() > collection.size())
			throw new ColaExceededSizeException("Party is full, pa tu casa");
		else
			return collection.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return collection.retainAll(c);
	}

	/**
	 * Removes everything from the collection.
	 * 
	 * @deprecated This method, alongside remove(), is not accepted for this
	 *             collection. Remove elements 1 at a time until there is just 1
	 *             left.
	 * 
	 * @throws Exception 'ColaExceededSizeException' if the collection is empty.
	 * @throws Exception 'ElementBlockedException' if there is at least 1 object in
	 *                   the collection.
	 */
	public void clear() throws Exception {
		throw collection.size() == 0 ? new ColaExceededSizeException("Hippity hoppity esta mas vacio que mi cabeza")
				: new ElementBlockedException("No puedes vaciar por completo la coleccion perro");
//		if (coleccion.size() == 0)
//			throw new ColaExceededSizeException("Hippity hoppity esta mas vacio que mi cabeza");
//		else
//			throw new ElementBlockedException("No puedes vaciar por completo la coleccion perro");
	}

	/**
	 * Adds an object at the end of the collection.
	 * 
	 * @param e Object to add.
	 * @return True or false, whether it added it successfully or not.
	 */
	public boolean add(T e) throws Exception {
		boolean legit = collection.size() < 10 && e != null && collection.add(e) ? true : false;

		if (legit) {
			Collections.sort(collection, comparar);
			return true;
		} else
			throw collection.size() == 10 ? new ColaExceededSizeException("Ya no me cabe mas senpai")
					: new LlevateTuNullDeAquiExcepcion("No se permiten nulls payaso");

//		if (coleccion.size() < 10)
//			if (e == null)
//				throw new LlevateTuNullDeAquiExcepcion("No se permiten nulls payaso");
//			else if (coleccion.add(e)) {
//				Collections.sort(coleccion, comparar);
//				return true;
//			} else
//				return false;
//		else
//			throw new ColaExceededSizeException("Ya no me cabe mas senpai");
	}

	public boolean offer(T e) {
		try {
			return add(e);
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
	}

	/**
	 * Removes everything from the collection.
	 * 
	 * @deprecated This method, alongside clear(), is not accepted for this
	 *             collection. Remove elements 1 at a time until there is just 1
	 *             left.
	 * 
	 * @throws Exception 'ColaExceededSizeException' if the collection is empty.
	 * @throws Exception 'ElementBlockedException' if there is at least 1 object in
	 *                   the collection.
	 */
	public T remove() throws Exception {
		throw collection.size() == 0 ? new ColaExceededSizeException("Hippity hoppity esta mas vacio que mi cabeza")
				: new ElementBlockedException("No puedes vaciar por completo la coleccion perro");
//		if (coleccion.size() == 0)
//			throw new ColaExceededSizeException("Hippity hoppity esta mas vacio que mi cabeza");
//		else
//			throw new ElementBlockedException("No puedes vaciar por completo la coleccion perro");
	}

	public T poll() {
		T col = collection.get(0);
		collection.remove(0);
		return col;
	}

	public T element() {
		// TODO devolver excepcion
		return collection.get(0);
	}

	public T peek() {
		return collection.get(0);
	}

}
