package jstd.bk.dp.builderpartten;

import jstd.bk.dp.bean.Product;

public class ProductBuilder {
	
	private Product prd;
	
	public ProductBuilder() {
		System.out.println("Product Build start");
		this.prd = new Product();
	}
	
	public ProductBuilder setParamA(String paramA) {
		this.prd.setParamA(paramA);
		return this;
	}
	
	public ProductBuilder setParamB(String paramB) {
		this.prd.setParamB(paramB);
		return this;
	}
	
	public ProductBuilder setParamC(String paramC) {
		this.prd.setParamC(paramC);
		return this;
	}
	
	public Product build() {
		System.out.println("Product Build end");
		return this.prd;
	}

}
