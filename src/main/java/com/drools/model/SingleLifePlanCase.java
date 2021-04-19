package com.drools.model;

import com.drools.types.PlanType;

public class SingleLifePlanCase {
	private String contractId;
	private PlanType type;
	private String name;
	private String programCode;
	private int reinsuranceCode;
	private String eligible;
	private int age;
	private boolean isTobacco;
	private double premium;
	
	/*public SingleLifePlanCase(){
		super(PlanType.SINGLE_LIFE);
	} */
	
	
	
	/**
	 * @return the contractId
	 */
	public String getContractId() {
		return contractId;
	}



	/**
	 * @param contractId the contractId to set
	 */
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}



	/**
	 * @return the age
	 */
	
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the isTobacco
	 */
	public boolean isTobacco() {
		return isTobacco;
	}
	/**
	 * @param isTobacco the isTobacco to set
	 */
	public void setTobacco(boolean isTobacco) {
		this.isTobacco = isTobacco;
	}
	/**
	 * @return the premium
	 */
	public double getPremium() {
		return premium;
	}
	/**
	 * @param premium the premium to set
	 */
	public void setPremium(double premium) {
		this.premium = premium;
	}



	/**
	 * @return the type
	 */
	public PlanType getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(PlanType type) {
		this.type = type;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the programCode
	 */
	public String getProgramCode() {
		return programCode;
	}



	/**
	 * @param programCode the programCode to set
	 */
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}



	/**
	 * @return the reinsuranceCode
	 */
	public int getReinsuranceCode() {
		return reinsuranceCode;
	}



	/**
	 * @param reinsuranceCode the reinsuranceCode to set
	 */
	public void setReinsuranceCode(int reinsuranceCode) {
		this.reinsuranceCode = reinsuranceCode;
	}



	/**
	 * @return the eligible
	 */
	public String getEligible() {
		return eligible;
	}



	/**
	 * @param eligible the eligible to set
	 */
	public void setEligible(String eligible) {
		this.eligible = eligible;
	}



	
	
	
	

}
