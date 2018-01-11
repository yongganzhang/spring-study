package com.shsxt.demo;

import java.util.List;
import java.util.Set;

public class UserService {
	
	private List<String> food ;
	
	
	private Set <String> set;
	

	public void setList(List<String> food) {
		this.food = food;
	}

	public List<String> getFood() {
		return food;
	}

	public void setFood(List<String> food) {
		this.food = food;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}
	


}
