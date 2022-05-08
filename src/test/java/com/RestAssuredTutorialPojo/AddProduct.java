package com.RestAssuredTutorialPojo;

import com.google.gson.Gson;

public class AddProduct implements Ibody {

	   private String prod_name;
	   private String prod_desc; 
	   private String prod_price;


	public AddProduct(String prod_name, String prod_desc, String prod_price) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_price = prod_price;
	}


	@Override
	public String toString() {
		return "addProductPojo [prod_name=" + prod_name + ", prod_desc=" + prod_desc + ", prod_price=" + prod_price
				+ "]";
	}


	public String toJson()
	{ 
		AddProduct Addpojo = new AddProduct (prod_name, prod_desc,prod_price);
		Gson gson = new Gson();
	    String data= gson.toJson(Addpojo );
		
		return data ;
	}
	
	
	
	
}




