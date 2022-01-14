package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Profesor;
import com.example.demo.service.IProfesorService;

@RestController
@RequestMapping("/api")
public class ProfesorController {

	@Autowired
	IProfesorService profesorService;
	
	@RequestMapping(value="/todos_profesores_public", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> todosProfesoresPublic(){
		List<Profesor> profesores = profesorService.findAllProfessor();
		if(profesores != null && profesores.size()>0) {
			return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
		}
		
		return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/todos_profesores_admin", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> todosProfesoresAdmin(){
		List<Profesor> profesores = profesorService.findAllProfessor();
		if(profesores != null && profesores.size()>0) {
			return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
		}
		
		return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/todos_profesores_user", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> todosProfesoresUser(){
		List<Profesor> profesores = profesorService.findAllProfessor();
		if(profesores != null && profesores.size()>0) {
			return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
		}
		
		return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
	}
}
