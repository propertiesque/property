package com.property.property.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property.property.entity.OtpBucket;
import com.property.property.service.OtpService;
import com.property.property.service.OtpServiceImpl;

@RestController
@RequestMapping("/otp")
public class OtpController {
	
	@Autowired
	private OtpService otpService;
	
	@GetMapping
	public List<OtpBucket> getAllOtp(){
		List<OtpBucket> otpBucketList = new ArrayList<OtpBucket>();
		otpBucketList = otpService.getAllOtp();
		return otpBucketList;
		
	}

	@PostMapping
	public OtpBucket saveotp(@RequestBody OtpBucket otp)
	{
		try {
		OtpBucket savedOtp = otpService.saveOtp(otp);
		return otp;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return otp;
	}
}
