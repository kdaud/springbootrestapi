package com.kdaud.springbootrest;

public class Fellowship {
	private int id;
	private String fellowName;
	private String catagory;
	private boolean eligibility;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fellowName
	 */
	public String getFellowName() {
		return fellowName;
	}
	/**
	 * @param fellowName the fellowName to set
	 */
	public void setFellowName(String fellowName) {
		this.fellowName = fellowName;
	}
	/**
	 * @return the catagory
	 */
	public String getCatagory() {
		return catagory;
	}
	/**
	 * @param catagory the catagory to set
	 */
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	/**
	 * @return the eligibility
	 */
	public boolean isEligibility() {
		return eligibility;
	}
	/**
	 * @param eligibility the eligibility to set
	 */
	public void setEligibility(boolean eligibility) {
		this.eligibility = eligibility;
	}
	

}
