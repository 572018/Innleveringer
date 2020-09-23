package no.hvl.dat100;

public class oppg_3 {

	public static void main(String[] args) {
		
		int [][] matrix = {
				{1,2,3,4,5},
				{11,12,13,14,15},
				{21,22,23,24,25}
		};
		skrivUtv1(matrix);
		System.out.println(tilStreng(matrix));
		System.out.println(tilStreng(skaler(2, matrix)));
		System.out.println(erLik(matrix, (skaler(1, matrix))));
		System.out.println(erLik(matrix, (skaler(2, matrix))));
	}
	
	public static void skrivUtv1(int[][] matrise) {
		
		for (int [] i: matrise) {
			String matrixString = "{";
			for(int n: i) {
				matrixString += n + ",";
			}
			matrixString += "}";
			System.out.println(matrixString);
		}
	}
	public static String tilStreng(int[][] matrise) {
		String matrixString = ""; 
		for (int [] i: matrise) {
			for(int n: i) {
				matrixString += n + " ";
			} 
			matrixString += "\n";	
		}
		return matrixString;
	}
	public static int[][] skaler(int tall, int[][] matrise){
		int [][] matrixMulti = new int [matrise.length][matrise[0].length] ;
		for (int i = 0; i < matrise.length; i++) {
			for(int n = 0; n < matrise[0].length; n++) {
				matrixMulti[i][n] = matrise[i][n]*tall;
			}
		}
		return matrixMulti;
	}
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		for (int i = 0; i < mat1.length; i++) {
			for (int n = 0; n < mat1[0].length; n++) {
				if ( mat1[i][n] != mat2[i][n]) {
					return false;
				}
			}
		}
		return true;
	}
}
