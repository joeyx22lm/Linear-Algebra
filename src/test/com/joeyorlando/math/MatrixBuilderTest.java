package com.joeyorlando.math;

import org.junit.Assert;
import org.junit.Test;

public class MatrixBuilderTest {

	private void testMatrixSize(int size) throws Exception {
		int[][] matrix = MatrixTestUtils.getRandomSquareMatrix(size);
		Assert.assertEquals(size, matrix.length);
		Assert.assertEquals(size, matrix[0].length);
		Assert.assertEquals(size, matrix[1].length);
		Assert.assertEquals(size, matrix[2].length);
	}
	
	@Test
	public void testRandomMatrixSize() throws Exception {
		int size = MatrixTestUtils.getSecureRandomInt();
		System.out.println("testRandomMatrixSize("+size+")");
		testMatrixSize(size);
	}
	
	@Test
	public void test3x3MatrixSize() throws Exception {
		testMatrixSize(3);
	}
	
	
}
