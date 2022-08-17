package com.app.SpringLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patients {

	private int id;

	public Patients() {
		System.out.println("Inside Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + "]";
	}

	@PostConstruct
	public void methodone() {
		System.out.println("Inside method 1");
	}

	@PreDestroy
	public void methodtwo() {
		System.out.println("Inside method 2");

	}
}
