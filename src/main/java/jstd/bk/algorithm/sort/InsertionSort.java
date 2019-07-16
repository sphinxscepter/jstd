package jstd.bk.algorithm.sort;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] ints = new int[] {4,2,8,9,5,7,6,1,3};
		Commons.display(ints);
		int intsLen = ints.length;
		for(int i = 0; i < intsLen; i++) {
			int tmp = ints[i];
			int j = i;
			while(j > 0 && tmp < ints[j - 1]) {
				ints[j] = ints[j - 1];
				j--;
			}
//			for(; j > 0; j--) {
//				if(tmp < ints[j - 1]) {
//					ints[j] = ints[j - 1];
//				}
//			}
			ints[j] = tmp;
			Commons.display(ints);
		}
		Commons.display(ints);
	}

}
