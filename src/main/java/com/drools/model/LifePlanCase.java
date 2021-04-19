package com.drools.model;

import com.drools.types.PlanType;

public abstract class LifePlanCase {
	private PlanType type;
	private String name;
	private String programCode;
	private int reinsuranceCode;
	private boolean eligible;
	
	LifePlanCase(PlanType type){
		this.type=type;
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
	public boolean isEligible() {
		return eligible;
	}
	/**
	 * @param eligible the eligible to set
	 */
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}
	
	

}
