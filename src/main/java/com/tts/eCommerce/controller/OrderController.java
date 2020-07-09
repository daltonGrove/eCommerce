package com.tts.eCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Order;
import com.tts.eCommerce.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/checkout")
	public String checkout(Cart cart, Model model) {
		Order purchaseOrder = orderService.makePurchaseOrder(cart);
		model.addAttribute("purchaseOrder", purchaseOrder);
		return "storefront/invoice";
	}

}
