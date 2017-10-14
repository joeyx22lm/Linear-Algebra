package com.joeyorlando.math;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
	/**
	 * Given some list of numbers divisible by <width>, return the square matrix (<width> x <width>) of the numbers.
	 * @param lst Space-delimited numbers.
	 * @param width
	 * @return Multidimensional array of int's.
	 * @throws Exception
	 */
	public static int[][] buildSquareMatrix(List<Integer> lst, int width) throws Exception{
		if(lst != null && lst.size()%width==0){
			int[][] out = new int[width][width];
			for(int i = 0;i<lst.size();i++){
				out[i/width][i%width] = lst.get(i);
			}
			return out;
		}
		throw new Exception("Cannot build square matrix. Incorrect data size.");
	}
	
	public static int getDeterminantByCofactors(int[][] matrix) throws Exception{
		if(matrix != null){
			/*
			 * Base case, 2x2 matrix; det(A)= ad-bc
			 */
			if(matrix.length == 2){
				return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
			}
			
			/*
			 * All other cases, begin cofactor expansion on row one.
			 */
			int det = 0;
			for(int col = 0; col < matrix.length; col++){
				ArrayList<Integer> subMatrix = new ArrayList<Integer>();
				for(int r = 1; r < matrix.length; r++){
					for(int c = 0; c < matrix.length; c++){
						if(c == col) continue;
						subMatrix.add(matrix[r][c]);
					}
				}

				// Skip if zero.
				if(matrix[0][col] != 0){
					det += (col % 2 == 0 ? 1 : -1) * matrix[0][col] * getDeterminantByCofactors(buildSquareMatrix(subMatrix, matrix.length-1));
				}
			}
			return det;
		}
		throw new Exception("Cannot calculate matrix.");
	}
}
