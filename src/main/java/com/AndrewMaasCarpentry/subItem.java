package com.AndrewMaasCarpentry;

public class subItem {
    private String aDescription;
    private Double aCost;

    public subItem(String aDescription, Double aCost) {
        this.aDescription = aDescription;
        this.aCost = aCost;
    }


    public Double getaCost() {
        return aCost;
    }
    public void setaCost(Double aCost) {
        this.aCost = aCost;
    }

    public String getaDescription() {
        return aDescription;
    }

    public void setaDescription(String aDescription) {
        this.aDescription = aDescription;
    }
}
