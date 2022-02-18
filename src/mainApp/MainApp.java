package mainApp;

import utils.ColaDelCastigo;

public class MainApp {

	public static void main(String[] args) {
		ColaDelCastigo<Integer> col = new ColaDelCastigo<>((o1, o2) -> {
			return o1 - o2;
		});

		ColaDelCastigo<Integer> castigo = new ColaDelCastigo<>((o1, o2) -> {
			return o1 - o2;
		});

		for (int i = 0; i < 4; i++)
			try {
				castigo.add(i);
			} catch (Exception e) {
				e.printStackTrace();
			}

		Object[] a = new Integer[2];

		try {
			a = castigo.toArray();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		try {
			a = castigo.toArray(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		try {
			col.remove(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			col.add(2);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			col.add(3);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			col.remove(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			col.remove(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			for (int i = 1; i < 10; i++) {
				col.add((int) (Math.random() * 100));
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

//		try {
//			col.remove();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
