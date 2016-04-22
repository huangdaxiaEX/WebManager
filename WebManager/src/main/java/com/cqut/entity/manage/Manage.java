package com.cqut.entity.manage;

/**
 * entity
 * 
 * @author zzy
 * 
 */
public class Manage {

	private java.math.BigInteger manageID;
	private Long imageID;

	public Manage(){
		// b305
	}
	
	public Manage(java.math.BigInteger manageID, Long imageID){
		this.manageID = manageID;
		this.imageID = imageID;
	}
	
	public java.math.BigInteger getManageID(){
		return manageID;
	}
	
	public void setManageID(java.math.BigInteger manageID) {
		this.manageID = manageID;
	}
	
	public Long getImageID(){
		return imageID;
	}
	
	public void setImageID(Long imageID) {
		this.imageID = imageID;
	}
	
	@Override
	public String toString() {
		return "Manage [" + "manageID=" + manageID + ", " + "imageID=" + imageID + "]";
	}
}
