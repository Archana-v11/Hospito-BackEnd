package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.SignupEntity;

public interface SignupInt 
{
   public List<SignupEntity>getDetails();
   public List<SignupEntity> getAll(int id,String firstname);
   public void saveSignup(SignupEntity se);
   public void updateSignup(SignupEntity se);
   public void deleteSignup(int id);
}
