package com.property.property.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.property.property.entity.OtpBucket;

@Repository
public interface OtpBucketRepository extends MongoRepository<OtpBucket, Long>{

}
