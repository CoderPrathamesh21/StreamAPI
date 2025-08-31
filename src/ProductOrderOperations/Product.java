package ProductOrderOperations;

public class Product {
	
	private String productId;
	private String productName;
	private String category;
	private double price;
	private String currency;
	private String eventTime; // ISO date string
	private String eventType; // e.g. "PRICE_UPDATE"
	
	public Product() {
		super();
		
	}

	public Product(String productId, String productName, String category, double price, String currency,
			String eventTime, String eventType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.currency = currency;
		this.eventTime = eventTime;
		this.eventType = eventType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", currency=" + currency + ", eventTime=" + eventTime + ", eventType="
				+ eventType + "]";
	}
	
	
	
	

}
