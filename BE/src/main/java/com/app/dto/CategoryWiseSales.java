package com.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryWiseSales {

	private String categoryName;
	private Long quantity;

	public CategoryWiseSales() {

	}

	public CategoryWiseSales(String categoryName, Long quantity) {
		super();
		this.categoryName = categoryName;
		this.quantity = quantity;
	}

	

}
