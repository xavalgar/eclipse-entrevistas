
public class ejercicio1 {
	public static void main(String[] args) {
		
		int[] A = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
		
		int aux =0;
		
		for (int i : A) {
			if(i%4 == 0) {
				aux += i;
			}
		}
		
		System.out.println(aux);
	}

}