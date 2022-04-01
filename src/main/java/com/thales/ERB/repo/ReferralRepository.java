package com.thales.ERB.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thales.ERB.entity.Referral;

public interface ReferralRepository  extends JpaRepository<Referral, Integer> {
	

}