package com.wdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wdm.entity.Paypal;

@Repository
public interface PaypalRepository extends JpaRepository<Paypal, Long> {
	
	
	
	

}
