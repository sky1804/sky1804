package entities;

public class OrderItem {

	private Integer quantity;
	double price;
	
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public Product getProduct() {
		
		return product;
	}

	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
	
}
