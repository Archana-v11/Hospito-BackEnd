package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LoginEntity;
import com.example.demo.Repository.LoginRepoInt;


@Service
public class LoginService implements LoginInt 
{
	@Autowired
    private LoginRepoInt lri;
   @Override
   public List<LoginEntity> getLogin() 
   {
	  return lri.findAll();
   }
   @Override
   public void saveLogin(LoginEntity le)
   {
	  lri.save(le);
   }
   @Override
   public void updateLogin(LoginEntity le) 
   {
	   lri.save(le);
   }
   @Override
   public void deleteLogin(int id) 
   {
	  lri.deleteById(id);
   }
@Override
public List<LoginEntity> getAll(int id) {

	return lri.getAll(id);
}
}
