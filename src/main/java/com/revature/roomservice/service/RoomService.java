package com.revature.roomservice.service;

import java.util.List;
import java.util.NoSuchElementException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.roomservice.model.*;
import com.revature.roomservice.repo.RoomRepo;

@Service
public class RoomService {

	@Autowired
    private RoomRepo roomRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
    @Autowired
    public RoomService(RoomRepo roomRepo){
        super();
        this.roomRepo = roomRepo;
    }

    public List<Room> findAll(){
        return roomRepo.findAll();
    }

    public Room findById(int id){
        try{
            return roomRepo.findById(id).get();
        } catch (NoSuchElementException e){
            e.printStackTrace();
            return null;
        }
       
    }
    
    public Area findbyName(String name) {
    	return restTemplate.getForObject("http://localhost:8093/area/name/"+name, Area.class);
    }
    
    public List<Room> findByAreaName(Area area) {
    	
    	return roomRepo.findByArea(area);
    
    }
    
    public List<Room> findByDoctor(User doctor) {
    	
    	return roomRepo.findByDoctor(doctor);
    	
    	// return restTemplate.getForObject("" + doctor, User.class);
    	
    }
    
   public List<Room> findByNurse(User nurse) {
    	
    	return roomRepo.findByDoctor(nurse);
    	
    	// return restTemplate.getForObject("" + doctor, User.class);
    	
    }
    
    public Room findByPatient(Patient patient) {
    
    	return roomRepo.findByPatient(patient);
    
	}	
    
    // Add notify when transfer
    
}
