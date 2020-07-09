package com.tts.eCommerce.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Product;

public class CartService {
	
	@Autowired
	private ProductService productService;
	

	public Cart addLineItemToCart(Cart cart, Long productId, Integer quantity) {
		Optional<Product> productToAdd = productService.findById(productId);
		HashMap<Product, Integer> lineItemToAdd = new HashMap<>();
		lineItemToAdd.put(productToAdd, quantity);
		List<HashMap<Product, Integer>> cartItems = cart.getLineItems();
		cartItems.add(lineItemToAdd);
		cart.setLineItems(cartItems);
		return cart;
	}

	public Cart updateLineItemQuantity(Cart cart, Product product, Integer quantity) {
		List<HashMap<Product, Integer>> cartItems = cart.getLineItems();
		if(:)
		if (quantity > 0) {
			cartItems = cart.getLineItems();
		} else {
			cartItems = cart.LineItems();
		}
		return cart;
	}


	

}
