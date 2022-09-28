package com.lti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	
//	@Query("Select v FROM Vehicle v WHERE (SELECT u FROM UserDetails u WHERE u.status=?1)")
//	public List<Vehicle> getApprovedVehicle(String status);//pending  //approved

}
