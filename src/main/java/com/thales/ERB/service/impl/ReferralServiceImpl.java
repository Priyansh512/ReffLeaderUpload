package com.thales.ERB.service.impl;

import java.util.List;

import com.thales.ERB.entity.Referral;
import com.thales.ERB.repo.ReferralRepository;
import com.thales.ERB.service.ReferralService;

public class ReferralServiceImpl implements ReferralService {
	private ReferralRepository referralRepository;

	@Override
	public List<Referral> getAllReferrals() {
		// TODO Auto-generated method stub
		return referralRepository.findAll() ;
	}

	@Override
	public Referral saveReferral(Referral referral) {
		// TODO Auto-generated method stub
		return referralRepository.save(referral);
	}

	@Override
	public Referral updateReferral(Referral referral) {
		// TODO Auto-generated method stub
		return referralRepository.save(referral);
	}

	@Override
	public Referral getReferralById(Integer referralId) {
		// TODO Auto-generated method stub
		return referralRepository.findById(referralId).get();
	}

	@Override
	public void DeleteReferralbyId(Integer referralId) {
		// TODO Auto-generated method stub
		referralRepository.deleteById(referralId);
		
	}
	

}
