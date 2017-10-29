package com.joeyorlando.math;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MatrixCalculationTest {

	@Test
	public void test2x2Determinant() throws Exception {
		List<Integer> raw = Arrays.asList(1, 2, 3, 4);
		int[][] matrix = Matrix.buildSquareMatrix(raw, 2);
		Assert.assertEquals(-2, Matrix.getDeterminantByCofactors(matrix));
	}
	
	@Test
	public void test3x3Determinant() throws Exception {
		List<Integer> raw = Arrays.asList(3,0,4,3,4,2,0,4,-2);
		int[][] matrix = Matrix.buildSquareMatrix(raw, 3);
		Assert.assertEquals(0, Matrix.getDeterminantByCofactors(matrix));
	}
	
}
