package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	private Long id;
	private String Customer;
	private String AMC_date;
	private String M_date;
	private String product_name;

	protected Product() {
	}
	
	
	public Product(Long id, String customer, String aMC_date, String m_date, String product_name) {
		super();
		this.id = id;
		Customer = customer;
		AMC_date = aMC_date;
		M_date = m_date;
		this.product_name = product_name;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public String getAMC_date() {
		return AMC_date;
	}

	public void setAMC_date(String aMC_date) {
		AMC_date = aMC_date;
	}

	public String getM_date() {
		return M_date;
	}

	public void setM_date(String m_date) {
		M_date = m_date;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	

}
