package com.tts.eCommerce.service;

public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void save(Product product) {
	      productRepository.save(product);
	    }

}
