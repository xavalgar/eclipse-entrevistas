
public class ejercicio3 {

	public static void main(String[] args) {
		String s = "";
		//? puede aparecer una vez o ninguna
		// xyz$ pilla todo lo que termine en xyz
		System.out.println(s.matches("(?!$)a*b*"));

	}

}
