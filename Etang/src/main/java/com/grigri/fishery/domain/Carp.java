package com.grigri.fishery.domain;

public class Carp {


	private final int age;
	private final int lengthInCms;
	private final int weightInKilo;
    
	public Carp(int age, int lengthInCms, int weightInKilo) {
        this.age = age;
        this.lengthInCms = lengthInCms;
        this.weightInKilo = weightInKilo;
    }
	
	public int getAge() {
        return age;
    }
	
	public int getLengthInCms() {
        return lengthInCms;
    }
	public int weightInKilo() {
		return weightInKilo;
	}
	
}
