package util;

import java.util.function.Consumer;

import entities.Product;

public class UpdatePriceProduct implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
