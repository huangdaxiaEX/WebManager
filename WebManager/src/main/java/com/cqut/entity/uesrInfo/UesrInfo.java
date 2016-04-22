package com.cqut.entity.uesrInfo;

/**
 * entity
 * 
 * @author zzy
 * 
 */
public class UesrInfo {

	private java.math.BigInteger uesrInfoID;
	private String userName;
	private Long userID;
	private String password;
	private Long leve1;

	public UesrInfo(){
		// b305
	}
	
	public UesrInfo(java.math.BigInteger uesrInfoID, String userName, Long userID, String password, Long leve1){
		this.uesrInfoID = uesrInfoID;
		this.userName = userName;
		this.userID = userID;
		this.password = password;
		this.leve1 = leve1;
	}
	
	public java.math.BigInteger getUesrInfoID(){
		return uesrInfoID;
	}
	
	public void setUesrInfoID(java.math.BigInteger uesrInfoID) {
		this.uesrInfoID = uesrInfoID;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Long getUserID(){
		return userID;
	}
	
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getLeve1(){
		return leve1;
	}
	
	public void setLeve1(Long leve1) {
		this.leve1 = leve1;
	}
	
	@Override
	public String toString() {
		return "UesrInfo [" + "uesrInfoID=" + uesrInfoID + ", " + "userName=" + userName + ", " + "userID=" + userID + ", " + "password=" + password + ", " + "leve1=" + leve1 + "]";
	}
}
