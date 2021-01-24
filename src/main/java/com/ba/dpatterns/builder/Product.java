package com.ba.dpatterns.builder;

import java.math.BigDecimal;
import java.util.Date;



//POJO
public class Product {
	private Long id;
	private String name;
	private Date date;
	private Boolean inStock;
	private String description;
	private BigDecimal price;
	
	
	
	
	
	public Product(ProductBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.date = builder.date;
		this.inStock = builder.inStock;
		this.description = builder.description;
		this.price = builder.price;
	}


	public Product() {
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", date=" + date + ", inStock=" + inStock + ", description="
				+ description + ", price=" + price + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDate()=" + getDate() + ", getInStock()=" + getInStock() + ", getDescription()="
				+ getDescription() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public static class ProductBuilder{
		private Long id;
		private String name;
		private Date date;
		private Boolean inStock;
		private String description;
		private BigDecimal price;
		
		public ProductBuilder id(Long id) {
			this.id=id;
			return this;
		}
		public ProductBuilder name(String name) {
			this.name=name;
			return this;
		}
		public ProductBuilder date(Date date) {
			this.date=date;
			return this;
		}
		public ProductBuilder inStock(Boolean inStock) {
			this.inStock=inStock;
			return this;
		}
		public ProductBuilder description(String description) {
			this.description=description;
			return this;
		}
		public ProductBuilder price(BigDecimal price) {
			this.price=price;
			return this;
		}
		
		public Product build() {
			Product product =new Product(this);
			return product;
		}
	}
	//Constructorun okunma zorlugu ve aldýgý parametrelerin genellikle tam olarak efektif olmamasý 
	//Builder bize okunmada kolaylýk ve istedimiz parametrelere göre rahatlýkla girmemizi saglar
	//Fakat builder bellekte daha fazla yer kaplar

	

}
