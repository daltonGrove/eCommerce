package com.tts.eCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.service.CartService;

@Controller
@RequestMapping("/storefront")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@GetMapping("/cart")
	public String viewCart(Cart cart, Model model) {
		//code for cart
		
		model.addAttribute("cart", cart);
		return "storefront/cart";
	}
	@PostMapping("/storefront/cart")
		public String addToCart(@RequestParam Long productId, Cart cart, @RequestParam Integer quantity, Model model) {
		  Cart cart = cartService.addLineItemToCart(cart, productId, quantity);
		  cart = cartService.addLineItemToCart(cart, productId, quantity);
		  model.addAttribute("cart", cart);
		  return "storefront/cart";
}
	@PostMapping("/storefront/cart")
	public String changeCartLineItemQuantity(@RequestParam Long productId, Cart cart, @RequestParam Integer quantity, Model model) {
		  Cart cart = cartService.updateLineItemQuantity(cart, productId, quantity);
		  cart = cartService.updateLineItemQuantity(cart, productId, quantity);
		  model.addAttribute("cart", cart);
		  return "storefront/cart";
	}

}
