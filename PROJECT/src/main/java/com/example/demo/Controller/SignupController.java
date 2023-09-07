package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.SignupEntity;
import com.example.demo.Service.SignupService;
@CrossOrigin
@RestController
public class SignupController 
{
	@Autowired
    private SignupService ss;
    @GetMapping("/signupget")
    public List<SignupEntity>getSign()
    {
    	return ss.getDetails();
    }
    
    @GetMapping("/signupget1")
	public List<SignupEntity> getAllDetails(@RequestParam int id,@RequestParam String firstname)
	{
		return ss.getAll(id, firstname);
	}
    
    @PostMapping("/signuppost")
    public void saveDetails(@RequestBody SignupEntity se)
    {
    	ss.saveSignup(se);
    }
    
    @PutMapping("/signupput")
    public void updateDetails(@RequestBody SignupEntity se,@RequestParam int id)
    {
    	se.setId(id);
    	ss.updateSignup(se);
    }
    
    @DeleteMapping("/signupdelete")
    public void deleteDetails(@RequestParam int id)
    {
    	ss.deleteSignup(id);
    }
}
