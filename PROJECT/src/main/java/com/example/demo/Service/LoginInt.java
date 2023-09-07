package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.LoginEntity;


public interface LoginInt
{
   public List<LoginEntity>getLogin();
   public List<LoginEntity> getAll(int id);
   public void saveLogin(LoginEntity le);
   public void updateLogin(LoginEntity le);
   public void deleteLogin(int id);
}
