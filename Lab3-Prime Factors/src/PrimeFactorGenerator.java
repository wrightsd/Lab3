import java.util.ArrayList;

public class PrimeFactorGenerator {

	public static Object generate(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (i > 1) {
			for (int j = 2; j <i; j++) {
				if (PrimeFactors.generate(j).size() == 1) {
					list.add(j);
				}
			}
		}
		return list;
	}
}
