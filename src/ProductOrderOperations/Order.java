package ProductOrderOperations;

public class Order {
	
	private String orderId;
	private String productId;
	private String userId;
	private double orderAmount;
	private int quantity;
	private String paymentMode;
	private String orderStatus; // e.g. "PLACED", "CANCELLED"
	private String source; // e.g. "WEB", "MOBILE_APP", "POS"
	private String country;
	private String eventTime; // ISO date string
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String orderId, String productId, String userId, double orderAmount, int quantity, String paymentMode,
			String orderStatus, String source, String country, String eventTime) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.userId = userId;
		this.orderAmount = orderAmount;
		this.quantity = quantity;
		this.paymentMode = paymentMode;
		this.orderStatus = orderStatus;
		this.source = source;
		this.country = country;
		this.eventTime = eventTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", userId=" + userId + ", orderAmount="
				+ orderAmount + ", quantity=" + quantity + ", paymentMode=" + paymentMode + ", orderStatus="
				+ orderStatus + ", source=" + source + ", country=" + country + ", eventTime=" + eventTime + "]";
	}
	
	

}
