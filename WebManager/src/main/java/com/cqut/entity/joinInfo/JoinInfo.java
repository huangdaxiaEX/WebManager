package com.cqut.entity.joinInfo;

/**
 * entity
 * 
 * @author zzy
 * 
 */
public class JoinInfo {

	private java.math.BigInteger joinInfoID;
	private Long personID;
	private java.sql.Timestamp joinTime;
	private Long entryID;

	public JoinInfo(){
		// b305
	}
	
	public JoinInfo(java.math.BigInteger joinInfoID, Long personID, java.sql.Timestamp joinTime, Long entryID){
		this.joinInfoID = joinInfoID;
		this.personID = personID;
		this.joinTime = joinTime;
		this.entryID = entryID;
	}
	
	public java.math.BigInteger getJoinInfoID(){
		return joinInfoID;
	}
	
	public void setJoinInfoID(java.math.BigInteger joinInfoID) {
		this.joinInfoID = joinInfoID;
	}
	
	public Long getPersonID(){
		return personID;
	}
	
	public void setPersonID(Long personID) {
		this.personID = personID;
	}
	
	public java.sql.Timestamp getJoinTime(){
		return joinTime;
	}
	
	public void setJoinTime(java.sql.Timestamp joinTime) {
		this.joinTime = joinTime;
	}
	
	public Long getEntryID(){
		return entryID;
	}
	
	public void setEntryID(Long entryID) {
		this.entryID = entryID;
	}
	
	@Override
	public String toString() {
		return "JoinInfo [" + "joinInfoID=" + joinInfoID + ", " + "personID=" + personID + ", " + "joinTime=" + joinTime + ", " + "entryID=" + entryID + "]";
	}
}
