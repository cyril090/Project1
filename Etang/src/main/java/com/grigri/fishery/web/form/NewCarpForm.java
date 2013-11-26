package com.grigri.fishery.web.form;

public class NewCarpForm {
    
    private Integer lengthInCms;
    private Integer age;
    private Integer weightInKilo;
    
    public Integer getAge(){
    	return age;
    }
    public Integer getWeightInKilo() {
    	return weightInKilo;
    }
    public Integer getLengthInCms() {
        return lengthInCms;
    }

    public void setLengthInCms(Integer lengthInCms) {
        this.lengthInCms = lengthInCms;
    }
    public void setweightInKilo(Integer weightInKilo) {
    	this.weightInKilo = weightInKilo;
    }
    public void setAge(Integer age) {
    	this.age = age;
    }

    @Override
    public String toString() {
        return "NewCarpForm [lengthInCms=" + lengthInCms + "]";
    }

}
