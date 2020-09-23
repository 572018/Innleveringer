package no.hvl.dat100;

public class oppg_6 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int[] array2 = {7,6,5,4,3,2,1};
		int[][] matrix = 
			{{1,2,3,4,5},
			{6,7,8,9,10}};
		skrivUt(array);
		
		System.out.println(OutString(array));
		System.out.println(summer(array));
		System.out.println(summer2(array));
		System.out.println(summer3(array));
		
		int tall = 10;
		System.out.println(finnesTall(array, tall));
		
		System.out.println(OutString(reverser(array)));
		System.out.println(OutString(reverser2(array)));
		
		System.out.println(finnesTall2(matrix, tall));
		System.out.println(erSortert(array));
		System.out.println(OutString(settSammen(array, array2)));
	}
	public static void skrivUt (int[] tabell) {
		int i;
		for (i=0; i<=6; i++) {
			System.out.println(tabell[i]);
		}
		
	}
	public static String OutString(int[] tabell) {
		String text = "[" + tabell[0];
		for (int i=1; i<tabell.length; i++) {
			text += "," + tabell[i];
			
		}
		text +="]";
		return text;
	}
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i=0; i<tabell.length; i++) {
		sum += tabell[i];
		}
		return sum;
	}
	public static int summer2(int[] tabell) {
		int sum = 0;
		int i=0;
		while(i<tabell.length) {
		sum += tabell[i];
		i++;
		}
		return sum;
	}
	public static int summer3(int[] tabell) {
		int sum = 0;
		
		for (int i: tabell) {
		sum += i;
		}
		return sum;
	}
	public static boolean finnesTall (int[] tabell, int tall) {
		for (int i: tabell) { 
			if (tall == i) 
				return true;
		}
			return false; 	
	}
	public static boolean finnesTall2 (int[][] tabell, int tall) {
		for (int[] i: tabell) { 
			for (int l: i) {
			if (tall == l) 
				return true;
		}}
			return false; 
			
	}
	public static int[] reverser(int[] tabell) {
		int[] revArray = new int[tabell.length];
		for (int i = 0; i<tabell.length; i++) {
			revArray[i] = tabell[tabell.length-1-i];
		}
		return revArray;
	}
	public static int[] reverser2(int[] tabell) {
		int[] revArray = new int[tabell.length];
		for (int i : tabell) {
			revArray[i-1] = tabell[tabell.length-i];
		}
		return revArray;
	}
	public static boolean erSortert (int[] tabell) {
		for (int i = 0; i < tabell.length-1; i++) {
			while (tabell[i] < tabell[i+1]) {
				return true;
			}
		}
		return false;
	}
	public static int[] settSammen(int[] tabell1,int[] tabell2){
		int [] array3 = new int[tabell1.length + tabell2.length];
		int k = 0;
		for(int i = 0; i < tabell1.length; i++) {
			array3[i] = tabell1[i];
		}
		for(int i = tabell1.length; i<array3.length; i++) {
			array3[i] = tabell2[k];
			k++;
		}
		return array3;
	}
}
	

