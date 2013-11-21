package com.grigri.fishery.web.form;

public class NewCarpForm {
    
    private Integer lengthInCms;
    // TODO add other fields (the field names must match the ID's in the HTML form.

    public Integer getLengthInCms() {
        return lengthInCms;
    }

    public void setLengthInCms(Integer lengthInCms) {
        this.lengthInCms = lengthInCms;
    }

    @Override
    public String toString() {
        return "NewCarpForm [lengthInCms=" + lengthInCms + "]";
    }

}
