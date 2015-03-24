import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PrimeFactorsTesting {

	@Test
	public void testOne() {
		assertEquals(list()	, PrimeFactors.generate(1));
	}
	
	public List<Integer> list(){
		return Arrays.asList();
	}

}
