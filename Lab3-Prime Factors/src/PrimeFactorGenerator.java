import java.util.ArrayList;


public class PrimeFactorGenerator {

	public static Object generate(int i) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(i>2){
			list.add(2);
		}
		if(i>3){
			list.add(3);
		}
		if(i>5){
			list.add(5);
		}
		return list;
	}

}
