package com.location.service;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.Entity.DealerInfo;
import com.location.dao.DealerInfoRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import lombok.extern.slf4j.Slf4j;
@Service

public class DealerServiceImpl   {
	
	private static final Logger logger = LoggerFactory.getLogger(DealerServiceImpl.class);

	
	@Autowired
	DealerInfoRepository dealerInfoRepository;
	
	// All dealers details
	public List<DealerInfo> getAllDealers() {
		List<DealerInfo> dealerInfo=dealerInfoRepository.findAll();
		logger.info("Fetched dealer information: {}", dealerInfo);
		return dealerInfo;
}
	//Dealers details get By City
   public List<DealerInfo> getDealerByCity(String city){
	   
	   List<DealerInfo> listByCity=dealerInfoRepository.findByCity(city);
	   logger.info("Fetched dealers: {}", listByCity);
	   return listByCity;
   }
   
  
   

public List<DealerInfo> getDealersByCityCustomQuery(String city) {
    logger.info("Fetching dealers by city using custom query: {}", city);
    List<DealerInfo> dealers = dealerInfoRepository.findByCityByCustomQuery(city);
    logger.info("Fetched dealers: {}", dealers);
    return dealers;
}


public List<DealerInfo> findNearestDealer(Double latitude, Double longitude) {
    return dealerInfoRepository.findNearestDealer(latitude, longitude);
}
	
}
