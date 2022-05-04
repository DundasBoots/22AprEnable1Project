package com.qa.ims.persistence.domain;

public class Order {
	private Long id;
	private String customer;
	private String item;
	
	public Order(String customer, String item) {
		super();
		this.customer = customer;
		this.item = item;
	}

	public Order(Long id, String customer, String item) {
		super();
		this.id = id;
		this.customer = customer;
		this.item = item;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "id:" + id + " customer:" + customer + " items:" + item;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (getCustomer() == null) {
			if (other.getCustomer() != null)
				return false;
		} else if (!getCustomer().equals(other.getCustomer()))
			return false;
		if (getItem() == null) {
			if (other.getItem() != null)
				return false;
		}else if (!getItem().equals(other.getItem()))
				return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}