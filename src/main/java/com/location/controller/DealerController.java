package com.location.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.location.Entity.DealerInfo;
import com.location.service.DealerServiceImpl;

@RestController
@RequestMapping("/v1")
public class DealerController {
	
	private static final Logger logger = LoggerFactory.getLogger(DealerController.class);
	
	@Autowired
    private DealerServiceImpl dealerServiceImpl;

	
	@GetMapping("/dealers")
	public ResponseEntity<List<DealerInfo>> getAllDealers() {
		List<DealerInfo> dealers=dealerServiceImpl.getAllDealers();
		logger.info("Fetched controllers dealers: {}", dealers);
		return new ResponseEntity<>(dealers,HttpStatus.OK);		
	}
	
	@GetMapping("/dealers/byCity")
	public ResponseEntity<List<DealerInfo>> getDealerByCity(@RequestParam String city){
		List<DealerInfo> dealers=dealerServiceImpl.getDealerByCity(city);
		 logger.info("Fetched dealers: {}", dealers);
		return new ResponseEntity<>(dealers,HttpStatus.OK);
	}
	
	@GetMapping("/dealers/by-city-custom")
    public ResponseEntity<List<DealerInfo>> getDealersByCityCustomQuery(@RequestParam String city) {
        logger.info("Fetching dealers for city using custom query: {}", city);
        List<DealerInfo> dealers = dealerServiceImpl.getDealersByCityCustomQuery(city);
        logger.info("Fetched dealers: {}", dealers);
        return new ResponseEntity<>(dealers, HttpStatus.OK);
    }
	
	@GetMapping("/dealers/nearest")
    public ResponseEntity<List<DealerInfo>> findNearestDealer(
            @RequestParam("latitude") Double latitude,
            @RequestParam("longitude") Double longitude) {
        List<DealerInfo> dealers = dealerServiceImpl.findNearestDealer(latitude, longitude);
        return ResponseEntity.ok(dealers);
    }
	
	

}
