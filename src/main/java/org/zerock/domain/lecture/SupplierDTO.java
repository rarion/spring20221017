package org.zerock.domain.lecture;

import java.util.List;

import lombok.Data;

@Data
public class SupplierDTO {
	private int id;
	private String name;
	private String contactName;
	private String city;
	private String postalCode;
	private String country;
	private String phone;
	private String address;
	private List<String> productName;
	private List<ProductDTO> product;
}
