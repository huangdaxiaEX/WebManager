package com.cqut.entity.crowdFunding;

/**
 * entity
 * 
 * @author zzy
 * 
 */
public class CrowdFunding {

	private java.math.BigInteger crowdFundingID;
	private Long entryID;
	private String entryTitle;
	private String entryType;
	private String entryPrice;
	private String entryContent;
	private Long entryStatus;
	private Long donePrice;
	private Double process;
	private Long publisherID;
	private java.sql.Timestamp publishTime;
	private java.sql.Timestamp deadTime;
	private String image;
	private Long totalPerson;
	private Long donePerson;

	public CrowdFunding(){
		// b305
	}
	
	public CrowdFunding(java.math.BigInteger crowdFundingID, Long entryID, String entryTitle, String entryType, String entryPrice, String entryContent, Long entryStatus, Long donePrice, Double process, Long publisherID, java.sql.Timestamp publishTime, java.sql.Timestamp deadTime, String image, Long totalPerson, Long donePerson){
		this.crowdFundingID = crowdFundingID;
		this.entryID = entryID;
		this.entryTitle = entryTitle;
		this.entryType = entryType;
		this.entryPrice = entryPrice;
		this.entryContent = entryContent;
		this.entryStatus = entryStatus;
		this.donePrice = donePrice;
		this.process = process;
		this.publisherID = publisherID;
		this.publishTime = publishTime;
		this.deadTime = deadTime;
		this.image = image;
		this.totalPerson = totalPerson;
		this.donePerson = donePerson;
	}
	
	public java.math.BigInteger getCrowdFundingID(){
		return crowdFundingID;
	}
	
	public void setCrowdFundingID(java.math.BigInteger crowdFundingID) {
		this.crowdFundingID = crowdFundingID;
	}
	
	public Long getEntryID(){
		return entryID;
	}
	
	public void setEntryID(Long entryID) {
		this.entryID = entryID;
	}
	
	public String getEntryTitle(){
		return entryTitle;
	}
	
	public void setEntryTitle(String entryTitle) {
		this.entryTitle = entryTitle;
	}
	
	public String getEntryType(){
		return entryType;
	}
	
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	
	public String getEntryPrice(){
		return entryPrice;
	}
	
	public void setEntryPrice(String entryPrice) {
		this.entryPrice = entryPrice;
	}
	
	public String getEntryContent(){
		return entryContent;
	}
	
	public void setEntryContent(String entryContent) {
		this.entryContent = entryContent;
	}
	
	public Long getEntryStatus(){
		return entryStatus;
	}
	
	public void setEntryStatus(Long entryStatus) {
		this.entryStatus = entryStatus;
	}
	
	public Long getDonePrice(){
		return donePrice;
	}
	
	public void setDonePrice(Long donePrice) {
		this.donePrice = donePrice;
	}
	
	public Double getProcess(){
		return process;
	}
	
	public void setProcess(Double process) {
		this.process = process;
	}
	
	public Long getPublisherID(){
		return publisherID;
	}
	
	public void setPublisherID(Long publisherID) {
		this.publisherID = publisherID;
	}
	
	public java.sql.Timestamp getPublishTime(){
		return publishTime;
	}
	
	public void setPublishTime(java.sql.Timestamp publishTime) {
		this.publishTime = publishTime;
	}
	
	public java.sql.Timestamp getDeadTime(){
		return deadTime;
	}
	
	public void setDeadTime(java.sql.Timestamp deadTime) {
		this.deadTime = deadTime;
	}
	
	public String getImage(){
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public Long getTotalPerson(){
		return totalPerson;
	}
	
	public void setTotalPerson(Long totalPerson) {
		this.totalPerson = totalPerson;
	}
	
	public Long getDonePerson(){
		return donePerson;
	}
	
	public void setDonePerson(Long donePerson) {
		this.donePerson = donePerson;
	}
	
	@Override
	public String toString() {
		return "CrowdFunding [" + "crowdFundingID=" + crowdFundingID + ", " + "entryID=" + entryID + ", " + "entryTitle=" + entryTitle + ", " + "entryType=" + entryType + ", " + "entryPrice=" + entryPrice + ", " + "entryContent=" + entryContent + ", " + "entryStatus=" + entryStatus + ", " + "donePrice=" + donePrice + ", " + "process=" + process + ", " + "publisherID=" + publisherID + ", " + "publishTime=" + publishTime + ", " + "deadTime=" + deadTime + ", " + "image=" + image + ", " + "totalPerson=" + totalPerson + ", " + "donePerson=" + donePerson + "]";
	}
}
