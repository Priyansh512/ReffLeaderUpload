package com.thales.ERB.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Referral {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int referralId;
	private String referralName;
	private String positionOffered;
	private boolean offer;
	private boolean diversity;

	public Referral(String referralName, String positionOffered, boolean offer, boolean diversity) {
		super();
		this.referralName = referralName;
		this.positionOffered = positionOffered;
		this.offer = offer;
		this.diversity = diversity;
	}

	public Referral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getReferralId() {
		return referralId;
	}

	public void setReferralId(int referralId) {
		this.referralId = referralId;
	}

	public String getReferralName() {
		return referralName;
	}

	public void setReferralName(String referralName) {
		this.referralName = referralName;
	}

	public String getPositionOffered() {
		return positionOffered;
	}

	public void setPositionOffered(String positionOffered) {
		this.positionOffered = positionOffered;
	}

	public boolean isOffer() {
		return offer;
	}

	public void setOffer(boolean offer) {
		this.offer = offer;
	}

	public boolean isDiversity() {
		return diversity;
	}

	public void setDiversity(boolean diversity) {
		this.diversity = diversity;
	}

}
