package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.SignupEntity;
import com.example.demo.Repository.SignupRepoInt;

@Service
public class SignupService implements SignupInt 
{
   
    @Autowired
    private SignupRepoInt sri;
	@Override
	public List<SignupEntity> getDetails() {
		
		return sri.findAll();
	}

    @Override
    public void saveSignup(SignupEntity se) 
    {
	  sri.save(se);
	
    }

   @Override
   public void updateSignup(SignupEntity se) 
   {
      sri.save(se);
	
   }

   @Override
   public void deleteSignup(int id) 
   {
	  sri.deleteById(id);
   }

@Override
public List<SignupEntity> getAll(int id, String firstname) {
	
	return sri.getAll(id, firstname);
}



}
