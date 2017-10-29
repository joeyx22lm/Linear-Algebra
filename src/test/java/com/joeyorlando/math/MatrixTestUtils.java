package com.joeyorlando.math;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class MatrixTestUtils {
	
	private static final SecureRandom defaultRandom = new SecureRandom();
	
	/*
	 * Return some random integer.
	 */
	public static int getSecureRandomInt(){
		int ret = defaultRandom.nextInt(500);
		return (ret == 0 ? 2 : ret);
	}
	
	/**
	 * Given some size n, return a randomized square matrix (n x n).
	 */
	public static int[][] getRandomSquareMatrix(int n) throws Exception {
		List<Integer> ret = new ArrayList<Integer>();
		for(int i = 0; i<(n*n);i++) ret.add(getSecureRandomInt());
		return Matrix.buildSquareMatrix(ret, n);
	}
}
