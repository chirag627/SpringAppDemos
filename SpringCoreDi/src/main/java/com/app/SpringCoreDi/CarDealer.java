package com.app.SpringCoreDi;

import java.util.Set;

public class CarDealer {
	private String name;
	private Set<String> model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getModel() {
		return model;
	}

	public void setModel(Set<String> model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", model=" + model + "]";
	}

}
