package com.grigri.fishery.domain;

public class Carp {


	private final int age;
	private final int lengthInCms;
    
	public Carp(int age, int lengthInCms) {
        this.age = age;
        this.lengthInCms = lengthInCms;
    }
	
	public int getAge() {
        return age;
    }
	
	public int getLengthInCms() {
        return lengthInCms;
    }

}
