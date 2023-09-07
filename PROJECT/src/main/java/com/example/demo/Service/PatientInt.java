package com.example.demo.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.Entity.PatientEntity;


public interface PatientInt 
{
    public List<PatientEntity>getPatient();
    public List<PatientEntity> getAll(int id,String name);
    public void savePatient(PatientEntity pae);
    public void updatePatient(PatientEntity pae);
    public void deletePatient(int id);
    public Page<PatientEntity> getpagingdata(int pageno, int pagesize);
	public Iterable<PatientEntity> getSortingdata(String field,String order);
	public Page<PatientEntity> getpagingsortingdata(int pageno, int pagesize, String field, String order) ;
}
