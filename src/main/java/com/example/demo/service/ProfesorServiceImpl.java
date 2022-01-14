package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProfesorDao;
import com.example.demo.entity.Profesor;

@Service("profesorService")
public class ProfesorServiceImpl implements IProfesorService{

	@Autowired
	IProfesorDao profesorDao;
	@Override
	public List<Profesor> findAllProfessor() {
		return (List<Profesor>) profesorDao.findAll();
	}

}
