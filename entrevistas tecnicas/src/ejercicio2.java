import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ejercicio2 {

	public static void main(String[] args) {
		int N = 9;
		int K = 4;
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");
		map.put(7, "g");
		map.put(8, "h");
		map.put(9, "i");
		map.put(10, "j");
		map.put(11, "k");
		map.put(12, "l");
		map.put(13, "m");
		map.put(14, "n");
		map.put(15, "o");
		map.put(16, "p");
		map.put(17, "q");
		map.put(18, "r");
		map.put(19, "s");
		map.put(20, "t");
		map.put(21, "u");
		map.put(22, "v");
		map.put(23, "w");
		map.put(24, "x");
		map.put(25, "y");
		map.put(26, "z");

		Set<String> letters = new TreeSet<String>();

		do {
			int aux2 = (int) Math.floor(Math.random() * 25 + 1);

			String aux = map.get(aux2);
			if (!letters.contains(aux)) {
				letters.add(aux);
			}
		} while (letters.size() != K);

		ArrayList<String> prueba = new ArrayList<String>();

		for (Object object : letters) {
			prueba.add(object.toString());
		}

		String palindrome = "";
		int n2 = N;

		for (int i = 0; i < n2; i++) {
			if (n2 > 0) {
				palindrome += prueba.get(i);
			}
			n2 = n2 - 2;
		}

		n2 = N;

		if (N % 2 != 0) {
			palindrome += prueba.get(prueba.size() - 1);
		}

		for (int i = K; i < n2; i--) {
			if (n2 > 0) {
				if (!(i == 0)) {
					palindrome += prueba.get(i - 1);
				}

			}
			n2 = n2 - 2;
		}

		System.out.println(palindrome);

	}

}
