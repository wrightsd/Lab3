import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeFactorGeneratorTest {
	private int inputNumber;
	private List<Integer> list;
	
	private static List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}
	
	@Parameters
	public static Collection upperLimits(){
		return Arrays.asList(new Object[][]{
				{1,list()},
				{3,list(2)},
		});
	}
	
	public PrimeFactorGeneratorTest(int inputNumber,List<Integer> list){
		this.inputNumber=inputNumber;
		this.list=list;
	}
	
	@Test
	public void testPrimeFactorGenerator() {
		assertEquals(list,PrimeFactorGenerator.generate(inputNumber));
	}
}
