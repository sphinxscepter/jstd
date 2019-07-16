package jstd.bk.algorithm.sort;

/**
 * 冒泡排序
 * @author lenovo
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] ints = new int[] {4,2,8,9,5,7,6,1,3};
		Commons.display(ints);
		int intsLen = ints.length;
		int tmp = 0;
		for(int i = 1; i < intsLen; i++) {
			boolean flag = true;
			System.out.println("-------------");
			for(int j = 0; j < intsLen - i; j++) {
				if(ints[j] > ints[j + 1]) {
					tmp = ints[j];
					ints[j] = ints[j + 1];
					ints[j + 1] = tmp;
					flag = false;
//					display(ints);
				}
			}
			if(flag) {
				break;
			}
			Commons.display(ints);
		}
		Commons.display(ints);
	}
	
}
