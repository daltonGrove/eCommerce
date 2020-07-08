package com.tts.eCommerce.service;

import com.tts.eCommerce.model.Product;

public class CartService {
	
	
	
	private void setQuantity(Product product, int quantity) {
		  if(quantity > 0){
		    cart().put(product, quantity);
		  } else {
		    cart().remove(product);
		  }
		  userService.updateCart(cart());
		}
	
	

}
