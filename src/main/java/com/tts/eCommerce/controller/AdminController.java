package com.tts.eCommerce.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tts.eCommerce.model.Product;

public class AdminController {
	
	@RequestMapping(value = {"/products/new", "/products/{productId}/edit"}, method = {RequestMethod.POST, RequestMethod.PUT })
	public String createOrUpdate(@Valid Product product) {
	  productService.save(product);
	  return "redirect:/admin/products/" + product.getId();
	}

}
