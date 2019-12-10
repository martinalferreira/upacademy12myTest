package io.altar.jseproject.model;

public class Shelf {
	
	private long id;
	private int capacity;
	private long productId;
	private float dailyPrice;
	
	
	
	public Shelf() {}

	public Shelf(int capacity, float dailyPrice) {
		super();
		this.capacity = capacity;
		this.dailyPrice = dailyPrice;
	}

	public Shelf(long id, int capacity, long productId, float dailyPrice) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.productId = productId;
		this.dailyPrice = dailyPrice;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public long getProduct() {
		return productId;
	}
	public void setProduct(long productId) {
		this.productId = productId;
	}
	public float getDailyPrice() {
		return dailyPrice;
	}
	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	@Override
	public String toString() {
		return "Shelf [id=" + id + ", capacity=" + capacity + ", productId=" + productId + ", dailyPrice=" + dailyPrice
				+ "]";
	}
	
	
	
}
