package mainApp;

import models.CompararInt;
import utils.ColaDelCastigo;

public class MainApp {

	public static void main(String[] args) {
		ColaDelCastigo<Integer> col = new ColaDelCastigo<Integer>(new CompararInt());
		col.add(2);
		col.add(1);
		System.out.println(col.peek());
	}

}
