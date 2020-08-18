package com.enigmacamp.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.enigmacamp.model.Product;

@RestController
public class ProductController {
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getListProducts(@CookieValue(value = "session", defaultValue = "no-cookie") String session) {
		List<Product> productList = new ArrayList<>();
		
		if (session.equals("no-cookie") == false) {
			productList.add(new Product("FRNTR0001", "Round Table"));
			HttpHeaders headers = new HttpHeaders();
			headers.add("Set-Cookie", "session=hijklmn");
			return new ResponseEntity<>(productList, headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@GetMapping("/productsbycode")
	public ResponseEntity<List<Product>> getListProductsByCode(@CookieValue(value = "session", defaultValue = "no-cookie") String session, @RequestParam("productCode") String productCode) {
		List<Product> productList = new ArrayList<>();

		if (session.equals("no-cookie") == false) {
			productList.add(new Product(productCode, "Wheel Chair"));
			HttpHeaders headers = new HttpHeaders();
			headers.add("Set-Cookie", "session=opqrstu");
			return new ResponseEntity<>(productList, headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}

	@GetMapping("/productsbypath/{productCode}")
	public ResponseEntity<List<Product>> getListProductsByPath(@CookieValue(value = "session", defaultValue = "no-cookie") String session, @PathVariable("productCode") String productCode) {
		List<Product> productList = new ArrayList<>();

		if (session.equals("no-cookie") == false) {
			productList.add(new Product(productCode, "Mountain Bike"));
			HttpHeaders headers = new HttpHeaders();
			headers.add("Set-Cookie", "session=vwxyz");
			return new ResponseEntity<>(productList, headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
}