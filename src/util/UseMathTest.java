package util;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.junit.Assert.*;

public class UseMathTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testGetMean() {
		UseMath math = new UseMath();
		double i1 []=new double[] {1,1,1,1,1,1,1,1,1,1};
		double x = math.getMean(i1);
		assertEquals(String.valueOf(0.0),String.valueOf(x));
		//fail("尚未实现");
	}


	@Test
	public void testGetStandardDeviation() {
		UseMath math = new UseMath();
		double i1 []=new double[] {1,1,1,1,1,1,1,1,1,1};
		double x = math.getStandardDeviation(i1);
		assertEquals(String.valueOf(0.0),String.valueOf(x));
		//fail("尚未实现");
	}

	@Test
	public void testGetvariance() {
		UseMath math = new UseMath();
		double i1 []=new double[] {1,1,1,1,1,1,1,1,1,1};
		double x = math.getvariance(i1);
		assertEquals(String.valueOf(0.0),String.valueOf(x));//你期待的结果你运行的结果
		//fail("尚未实现");
	}
	 
 

 

}
