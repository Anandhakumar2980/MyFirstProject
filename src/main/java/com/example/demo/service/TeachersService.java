package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teachers;
import com.example.demo.repository.TeachersRepository;

@Service
public class TeachersService {
	
	@Autowired
	public TeachersRepository teachersRepository;
	
	public List<Teachers> getAllTeachers(){
		
		return teachersRepository.findAll();
		
	}
	
	public Optional<Teachers> getTeacherById( Long id ){
		
		return teachersRepository.findById( id );
		
	}

	public ResponseEntity<Teachers> updateTeacherById( Long id, Teachers teacherDetails ) {
		
		Optional<Teachers> teacher = teachersRepository.findById(id);
		
		teacher.
				
		return null;
	}
	
	
	
	/*
	 * public String deleteTeacherById( Long id ){
	 * 
	 * Optional<Teachers> teacher = teachersRepository.findById(id);
	 * 
	 * teachersRepository.deleteAll(teacher);
	 * 
	 * Map<String, String> response = new HashMap();
	 * 
	 * response.put( "Status", "Successfully deleted" );
	 * 
	 * return ResponseEntity.ok(response);
	 * 
	 * 
	 * }
	 */

}
