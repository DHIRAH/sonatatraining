package com.sonata.pModel;
public class Product {
    private int proId;
    private String proName;	
    private double proPrice;	
    public int getProId() {	
        
        return proId;	
    }
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}	

}