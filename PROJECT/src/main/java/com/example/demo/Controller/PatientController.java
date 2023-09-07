package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.PatientEntity;
import com.example.demo.Service.PatientService;

@RestController
@CrossOrigin
public class PatientController 
{
    @Autowired
    private PatientService ps;
    @GetMapping("/patientget")
    public List<PatientEntity> getPatientDetails()
    {
    	return ps.getPatient();
    }
    
    @GetMapping("/patientget1")
	public List<PatientEntity> getAllDetails(@RequestParam int id,@RequestParam String name)
	{
		return ps.getAll(id,name);
	}
    
    @PostMapping("/patientpost")
    public void saveDetails(@RequestBody PatientEntity pae)
    {
    	ps.savePatient(pae);
    }
    
    @PutMapping("/patientput")
    public void updateDetails(@RequestBody PatientEntity pae,@RequestParam int id)
    {
    	pae.setId(id);
    	ps.updatePatient(pae);
    }
    
    @DeleteMapping("/patientdelete")
    public void deleteDetails(@RequestParam int id)
    {
    	ps.deletePatient(id);
    }
    
    // Paging
 	@GetMapping("/paggingget")
     Page<PatientEntity> getpagingdetails(@RequestParam int pageno,@RequestParam int pagesize)
     {
     	return ps.getpagingdata(pageno, pagesize);
     }
 	
 	// sorting
 	@GetMapping("/sortingget")
 	Iterable<PatientEntity> getsortingDetails(@RequestParam String field,@RequestParam String order)
 	{
 		return ps.getSortingdata(field,order);
 	}
 	
 	// Paging and sorting
 	@GetMapping("/paggingandsortingget")
     public Page<PatientEntity> getpagingsortingdetails(@RequestParam int pageno,@RequestParam int pagesize,@RequestParam String field,String order)
     {
     	return ps.getpagingsortingdata(pageno, pagesize,field,order);
     
     }
}
