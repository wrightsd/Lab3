import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeFactorGeneratorTest {
	private int inputNumber;
	private ArrayList list;
	
	@Parameters
	public static Collection upperLimits(){
		return Arrays.asList(new Object[][]{
				{1,new ArrayList()}
		});
	}
	
	public PrimeFactorGeneratorTest(int inputNumber,ArrayList list){
		this.inputNumber=inputNumber;
		this.list=list;
	}
	
	@Test
	public void testPrimeFactorGenerator() {
		assertEquals(list,PrimeFactorGenerator.generate(inputNumber));
	}
}
