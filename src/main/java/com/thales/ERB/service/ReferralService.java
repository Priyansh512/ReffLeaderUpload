package com.thales.ERB.service;

import java.util.List;


import com.thales.ERB.entity.Referral;

public interface ReferralService {
	List<Referral> getAllReferrals();
	Referral saveReferral(Referral referral);
	Referral updateReferral(Referral referral);
	Referral getReferralById(Integer referralId);
	void DeleteReferralbyId(Integer referralId);

}
