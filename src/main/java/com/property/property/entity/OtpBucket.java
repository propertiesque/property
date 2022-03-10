package com.property.property.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document(collection="otpBucket")
@Data
public class OtpBucket {
	
	@Id
    private long id;
	
    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String otp;
    

    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String emailId;
    
    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String phoneNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "OtpBucket [id=" + id + ", otp=" + otp + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}
    
    
	

}
