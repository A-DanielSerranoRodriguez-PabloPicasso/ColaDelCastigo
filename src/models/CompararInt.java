package models;

import java.util.Comparator;

public class CompararInt implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}

}
