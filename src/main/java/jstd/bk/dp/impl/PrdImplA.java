package jstd.bk.dp.impl;

import jstd.bk.dp.bean.Product;
import jstd.bk.dp.ifc.IProduct;

public class PrdImplA implements IProduct {

	@Override
	public Product newProductA() {
		System.out.println("PRODUCT A IMPL METHOD");
		return new Product();
	}

}
