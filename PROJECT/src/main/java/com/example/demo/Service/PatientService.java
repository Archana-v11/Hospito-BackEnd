package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.PatientEntity;
import com.example.demo.Repository.PatientRepoInt;


@Service
public class PatientService implements PatientInt
{
    
	@Autowired
    private PatientRepoInt pari;
	@Override
	public List<PatientEntity> getPatient() {
		
		return pari.findAll();
	}

	@Override
	public void savePatient(PatientEntity pae) 
	{
		pari.save(pae);
	}

	@Override
	public void updatePatient(PatientEntity pae) 
	{
		pari.save(pae);
	}

	@Override
	public void deletePatient(int id) 
	{
		pari.deleteById(id);
	}

	@Override
	public List<PatientEntity> getAll(int id, String name) {
		
		return pari.getAll(id,name);
	}
	
	
	@Override
	public Page<PatientEntity> getpagingdata(int pageno, int pagesize) 
	{
		Pageable page=PageRequest.of(pageno, pagesize);
		return pari.findAll(page);
	}
	@Override
	public Iterable<PatientEntity> getSortingdata(String field,String order) 
	{
		if(order.equals("asc"))
		{
		  return pari.findAll(Sort.by(field));
		}
		else
		{
		   return pari.findAll(Sort.by(Direction.DESC,field));
		}   
	}
    @Override
	public Page<PatientEntity> getpagingsortingdata(int pageno, int pagesize, String field, String order) 
	{

		Pageable page;
		if(order.equals("asc"))
		{
		page=PageRequest.of(pageno, pagesize,Direction.ASC,field); 
		}
		else
		{
			page=PageRequest.of(pageno, pagesize,Direction.DESC,field); 
		}
		return pari.findAll(page);
	
	}

	
}
