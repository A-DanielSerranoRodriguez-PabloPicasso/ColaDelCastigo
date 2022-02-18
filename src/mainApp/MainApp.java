package mainApp;

import utils.ColaDelCastigo;

public class MainApp {

	public static void main(String[] args) {
		ColaDelCastigo<Integer> col = new ColaDelCastigo<Integer>((o1, o2) -> {
			return o1 - o2;
		});

		try {
			for (int i = 1; i < 10; i++) {
				col.add(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			col.add(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i));
		}

		try {
			col.remove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
