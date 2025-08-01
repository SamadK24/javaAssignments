package com.swabhav.Product.Model;

import java.util.Comparator;

public class PriceAsc implements Comparator<ProductCategory>{

	@Override
	public int compare(ProductCategory o1, ProductCategory o2) {
		int categoryCompare = o1.getCategory().compareToIgnoreCase(o2.getCategory());
		if(categoryCompare != 0) {
			return categoryCompare;
		}
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
