package net.kzn.onlineshopping.dto;



import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Component
@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// private fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Please enter the product name!")
	private String name;
	@NotBlank(message = "Please enter the category name!")
	private String category;
	@NotBlank(message = "Please enter the image!")
	private String image_url;
	@Column(name = "tax_ep")
	private double tax_ep;
        @Column(name = "tax_ip")
	private double tax_ip;
       @Column(name = "tax_rate")
	private double tax_rate;
	private int quantity;
       @Column(name = "width")
	private int width;
       @Column(name = "height")
	private int height;
       @Column(name = "weight")
	private int weight;
       @Column(name = "depth")
	private int depth;
   @Column(name = "extra_shipfee")
	private double extra_shipfee;
	@Column(name = "is_active")	
	private boolean active;
	@Column(name = "category_id")
	@JsonIgnore
	private int categoryId;
	@Column(name = "supplier_id")
	@JsonIgnore
	private int supplierId;

	
	@Transient
	private MultipartFile file;
			
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}


	// default constructor
	public Product() {
		
		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}
	
	
	// setters and getters	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.tax_ep = tax_ep;
	}
	public int  getTax_ep() {
		return tax_ep;
	}
	public void setTax_ep(String tax_ep) {
		this.tax_ep = tax_ep;
	}
       public int getTax_ip() {
		return tax_ip;
	}
	public void setTax_ip(String tax_ip) {
		this.tax_ip = tax_ip;
	}
         public int getTax_rate() {
		return tax_rate;
	}
	public void setTax_rate(String tax_rate) {
		this.tax_rate = tax_rate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}


	
	// toString for debugging
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", category=" + category + ", tax_ep="
				+ tax_ep + ", tax_ip=" + tax_ip + ", tax_rate=" + tax_rate + ", quantity=" + quantity + ", width=" + width + ", height=" + height + ", weight=" + weight + ",depth=" + depth + ",extra_shipfee=" + extra_shipfee + ", active=" + active
				+ ", categoryId=" + categoryId + ", supplierId=" + supplierId + "]";
	}
}
