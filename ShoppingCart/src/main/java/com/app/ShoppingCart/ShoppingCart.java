package com.app.ShoppingCart;

public class ShoppingCart {
	private Items item;

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}

}
