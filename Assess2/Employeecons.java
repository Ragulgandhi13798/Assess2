package com.springcoreeg.springconst;

import java.util.List;

public class Employeecons {
	
	private int id;
	private String name;
	private List<String> rating;
	
	public Employeecons(int id, String name, List<String> rating)
	{
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Employeecons [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	

}
