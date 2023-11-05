package l11_hibernate_mapping.many2many;

import java.util.Set;

import jakarta.persistence.Entity;

@Entity
public class Items {
	
	private int id;
	private String itemId;
	private double price;
	private Set<Cart> items;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Cart> getItems() {
		return items;
	}
	public void setItems(Set<Cart> items) {
		this.items = items;
	}
	
	
}
