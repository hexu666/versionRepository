package com.temp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.temp.entity.Product;
import com.temp.entity.ProductForm;


@Controller
//@RequestMapping(value="/product")
public class ProductController {
	
	@RequestMapping(value="/product_input")
	public String inputProduct(){
		return "ProductForm";
	}
	
	@RequestMapping(value="/product_save")
	public String saveProduct(ProductForm productForm,Model model){
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		try {
			product.setPrice(Float.parseFloat(productForm.getPrice()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		//add product to 
		model.addAttribute("product", product);
		
		return "ProductDetails";
	}

}
