package com.location.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.location.Entity.DealerInfo;
import com.location.dao.DealerInfoRepository;

@ExtendWith(MockitoExtension.class)

@SpringBootTest
public class DealerServiceImplTest {
	@Mock
    private DealerInfoRepository dealerInfoRepository;
	
	@InjectMocks
    private DealerServiceImpl dealerServiceImpl;
	
	@Test
    void testGetDealersByCityCustomQuery() {
		String city = "PATNA";
        List<DealerInfo> expectedDealers = Arrays.asList(
            new DealerInfo(18203, "ZENITH ENTERPRISES", "2023-10-09 14:24:54", "System", 
                "2024-06-03 17:18:04", "System", 3, "MAIN", null, null, null, 
                null, city, "BH", "IN", null, "BNJ-01", "BIH", "EAST-Z", 
                25.59081837832682, 85.19129278984246, null, null, null)
        );
        when(dealerInfoRepository.findByCityByCustomQuery(city)).thenReturn(expectedDealers);

        List<DealerInfo> actualDealers = dealerServiceImpl.getDealersByCityCustomQuery(city);

        assertEquals(expectedDealers, actualDealers);
        verify(dealerInfoRepository, times(1)).findByCityByCustomQuery(city);
    
    }
}