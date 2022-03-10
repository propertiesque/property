package com.property.property.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.DefaultManagedAwareThreadFactory;
import org.springframework.stereotype.Service;

import com.property.property.entity.OtpBucket;
import com.property.property.repository.OtpBucketRepository;

@Service
public class OtpServiceImpl implements OtpService {
	
	
	@Autowired
	OtpBucketRepository otpBucketRepository;

	@Override
	public List<OtpBucket> getAllOtp() {
		return otpBucketRepository.findAll();
	}

	@Override
	public OtpBucket saveOtp(OtpBucket otp) {
		otp.setOtp(String.valueOf(Math.random()));
		return otpBucketRepository.save(otp);
	}


}
