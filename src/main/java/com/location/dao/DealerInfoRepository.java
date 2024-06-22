package com.location.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.location.Entity.DealerInfo;
import java.util.List;


@Repository
public interface DealerInfoRepository extends JpaRepository<DealerInfo, Integer> {
	
	List<DealerInfo> findByCity(String city);
	
	@Query("SELECT d FROM DealerInfo  d WHERE d.city = :city")
    List<DealerInfo> findByCityByCustomQuery(@Param("city") String city);
	
	@Query("SELECT d FROM DealerInfo d WHERE d.state = :state")
    List<DealerInfo> findByStateByCustomQuery(@Param("state") String state);
	
	@Query(value = "SELECT d.*, (6371 * ACOS(COS(RADIANS(:latitude)) * COS(RADIANS(d.latitude)) * COS(RADIANS(d.longitude) - RADIANS(:longitude)) + SIN(RADIANS(:latitude)) * SIN(RADIANS(d.latitude)))) AS distance " +
            "FROM dealers_info d " +
            "WHERE d.latitude IS NOT NULL AND d.longitude IS NOT NULL " +
            "HAVING distance IS NOT NULL " +
            "ORDER BY distance " +
            "LIMIT 5", nativeQuery = true)
	List<DealerInfo> findNearestDealer(@Param("latitude") Double latitude, @Param("longitude") Double longitude);
	
}
	
