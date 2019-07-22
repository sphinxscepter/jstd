package jstd.bk.dp.builderpartten;

import jstd.bk.dp.bean.Product;

public class BrdTest {
	
	public static void main(String[] args) {
		Product prd = new ProductBuilder().setParamA("A").build();
		System.out.println("paramA=" + prd.getParamA());
	}

}
