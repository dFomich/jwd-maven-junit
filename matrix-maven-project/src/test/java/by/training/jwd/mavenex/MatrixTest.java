package by.training.jwd.mavenex;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
	
	@Test
	
	public void compYT001() {
		
		double x = 1;
		double realY;
		double expectedY = 1.12;
		
		realY = Matrix.comput(x);
		
		Assert.assertEquals(expectedY, realY, 0.01);
	}
	
	@Test
	
	public void compYT002() {
		double x = 5.1;
		double realY;
		double expectedY = 1.6;
		
		realY = Matrix.comput(x);
		
		Assert.assertEquals(expectedY, realY, 0.05);
	}

	@Test
	
	public void printT001() {
		
	double a = Matrix.enterNumA();
	double b = Matrix.enterNumB();
	double h = Matrix.enterNumH();
	double realTestVar = Matrix.print(a, b, h);
	double expectedTestVar = (b - a) / h;
	
	Assert.assertEquals(expectedTestVar, realTestVar, 0000000.1);
	
	}
	
}
