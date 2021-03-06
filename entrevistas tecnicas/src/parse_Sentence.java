import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;


public class parse_Sentence {

// el antonio vacilon pega un error como una casa de grande
//	return Arrays.stream(datos.split(" ")).map(x -> Integer.parseInt(x)).reduce(0, Integer::sum);

	public static void main(String[] args) {
		String text = "hola que hola tal, bienvenidos a BettaTech. SI os est? gustando este v?deo y darle a la campanita para ver los nuevos v?deos que vaya subiendo!";

		System.out.println(wordRepetitions(text));

	}
	
	public static String deAccent(String str) {
	      String nfdNormalizedString = Normalizer.normalize(str,  Normalizer.Form.NFD); 
	      Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	      return pattern.matcher(nfdNormalizedString).replaceAll("");
	}

	public static String normalize(String word) {
		return deAccent(word.toLowerCase().replaceAll("[\\.\\,\\(\\)\\!]", ""));
	}

	public static Map<String, Integer> wordRepetitions(String text) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();

		String separateWords[] = text.split(" ");

		for (String word : separateWords) {
			if (map.containsKey(normalize(word))) {
				int aux = map.get(normalize(word));
				aux++;
				map.put(normalize(word), aux);
			} else {
				map.put(normalize(word), 1);
			}
		}
		return map;
	}
	
	
}
