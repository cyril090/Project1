package com.grigri.fishery.domain;

public class Carp {

    private Long id;
	private final int age;
	private final int lengthInCms;
	private final int weightInKilo;
    
	public Carp(Long id, int age, int lengthInCms, int weightInKilo) {
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
	
	public int getWeightInKilo() { // TODO renommer ceci pour utiliser la convention (get...)
		return weightInKilo;
	}
	
}
