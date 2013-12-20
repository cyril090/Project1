package com.grigri.fishery.domain;

public abstract class Fish {
	
private Long id;
private int age;
private int lengthInCms;
private int weightInKilo;
	    
public Fish(Long id, int age, int lengthInCms, int weightInKilo) {
	this.id = id;
    this.age = age;
    this.lengthInCms = lengthInCms;
    this.weightInKilo = weightInKilo;
    }

	public Long getId() {
        return id;
    }
	
	public void setId(Long id) {
        this.id = id;
    }
	
	public int getAge() {
        return age;
    }
	
	public int getLengthInCms() {
        return lengthInCms;
    }
	
	public int getWeightInKilo() { 
		return weightInKilo;
	}

}
