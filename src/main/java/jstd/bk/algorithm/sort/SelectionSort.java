package jstd.bk.algorithm.sort;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] ints = new int[] {4,2,8,9,5,7,6,1,3};
		Commons.display(ints);
		int intsLen = ints.length;
		for(int i = 0; i < intsLen; i++) {
			int min = ints[i];
			System.out.println("min = " + min);
			int index = i;
			for(int j = (i + 1); j < intsLen; j++) {
				if(ints[j] < min) {
					min = ints[j];
					index  = j;
					System.out.println("min = " + min);
				}
			}
			System.out.println("min = " + min);
			if(ints[i] > min) {
				int tmp = ints[i];
				ints[i] = min;
				ints[index] = tmp;
			}
			Commons.display(ints);
		}
		Commons.display(ints);
	}

}
