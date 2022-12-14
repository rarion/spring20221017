package org.zerock.domain.lecture;

import java.util.List;

import lombok.Data;

@Data
public class CategoryDTO {
	private int id;
	private String name;
	private List<String> productName;
	private List<ProductDTO> product;
}
