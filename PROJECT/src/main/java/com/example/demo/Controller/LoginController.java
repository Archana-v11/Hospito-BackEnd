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

import com.example.demo.Entity.LoginEntity;
import com.example.demo.Service.LoginService;

@RestController
@CrossOrigin
public class LoginController 
{
	@Autowired
    private LoginService ls;
    @GetMapping("/loginget")
    public List<LoginEntity>getLoginDetails1()
    {
    	return ls.getLogin();
    }
    
    @GetMapping("/loginget1")
	public List<LoginEntity> getAllDetails(@RequestParam int id)
	{
		return ls.getAll(id);
	}
    @PostMapping("/loginpost")
    public void saveDetails(@RequestBody LoginEntity le)
    {
    	ls.saveLogin(le);
    }
    
    @PutMapping("/loginput")
    public void updateDetails(@RequestBody LoginEntity le,@RequestParam int id)
    {
    	le.setId(id);
    	ls.updateLogin(le);
    }
    
    @DeleteMapping("/logindelete")
    public void deleteDetails(@RequestParam int id)
    {
    	ls.deleteLogin(id);
    }
}
