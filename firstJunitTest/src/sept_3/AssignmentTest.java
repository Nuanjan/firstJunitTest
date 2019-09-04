package sept_3;


import org.junit.Assert;
import org.junit.Test;

public class AssignmentTest {

	@Test
	public void greatestSumTest() {
		
		int[] randomInts = Example.createRandomArray(1007);
		
		int sum1 = 0, sum2 = 0;
		
		long runTime1 = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
		
			sum1 = Example.O_of_n_squared(randomInts);
		
		}
		
		runTime1 = System.currentTimeMillis() - runTime1;
		
		sum2 = sum1+1;
		
		long runTime2 = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
		
			sum2 = Example.inclassAssignment(randomInts);
		
		}
		
		runTime2 = System.currentTimeMillis() - runTime2;
				
		Assert.assertEquals("The sum returned by your function does not equal the sum returned by the example function.", sum1, sum2);
		
		System.out.println((runTime1)+"  "+(runTime2));
		
		Assert.assertTrue("Your function took too long to compute. O(n^2) time: "+runTime1+"ms your time "+runTime2+"ms", runTime1 > runTime2);
		
	}

}
