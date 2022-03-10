package com.property.property.service;

import java.util.List;

import com.property.property.entity.OtpBucket;

public interface OtpService {

	List<OtpBucket> getAllOtp();

	OtpBucket saveOtp(OtpBucket otp);

}
