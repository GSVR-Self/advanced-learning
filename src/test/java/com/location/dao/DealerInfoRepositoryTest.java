package com.location.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.location.Entity.DealerInfo;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class DealerInfoRepositoryTest {
	@Autowired
    private DealerInfoRepository dealerInfoRepository;

    @BeforeEach
    public void setUp() {}

}
