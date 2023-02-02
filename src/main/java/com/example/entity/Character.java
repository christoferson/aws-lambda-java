package com.example.entity;

import java.io.Serializable;

public class Character implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private int level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return String.format("Character [name=%s, level=%s]", name, level);
	}

}
