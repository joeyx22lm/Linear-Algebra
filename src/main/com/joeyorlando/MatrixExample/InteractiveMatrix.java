package com.joeyorlando.MatrixExample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.joeyorlando.math.Matrix;

public class InteractiveMatrix {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws NumberFormatException, Exception{
		if(args != null && args.length > 0){
			ArrayList<Integer> raw = new ArrayList<>();
			for(int i = 1;i<args.length;i++) raw.add(Integer.parseInt(args[i]));
			System.out.println("det(A) = " + Matrix.getDeterminantByCofactors(Matrix.buildSquareMatrix(raw, Integer.parseInt(args[0]))));
		}else{
			System.out.print("Matrix Size: ");
			int size = in.nextInt();
			in.nextLine();
			System.out.print("Matrix Data (space delimited): ");
			String data = in.nextLine();
			
			ArrayList<Integer> intArr = (ArrayList<Integer>) Arrays.stream(data.split(" "))
					.map(x -> Integer.parseInt(x))
					.collect(Collectors.toList());
			
			int[][] matrix = Matrix.buildSquareMatrix(intArr, size);
			int det = Matrix.getDeterminantByCofactors(matrix);
			System.out.println("det(matrix) = " + det);
		}
	}
}
