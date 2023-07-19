package com.demo.Student.Registration.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.Student.Registration.entity.MotherTong;
import com.demo.Student.Registration.enumeration.Status;
import com.demo.Student.Registration.repository.MotherTongReository;

@Service
public class MothertTongService  {
	
	@Autowired
	MotherTongReository motherTongReository;

	public void create(MotherTong mother) {

		MotherTong motherTong=new MotherTong();
		
		motherTong.setId(mother.getId());
		motherTong.setName(mother.getName());
		motherTong.setStatus(Status.ACTIVE);
		
		motherTongReository.save(mother);
	}
	
	

}
