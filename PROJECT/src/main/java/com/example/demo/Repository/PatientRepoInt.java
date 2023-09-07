package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.PatientEntity;

@Repository
public interface PatientRepoInt extends JpaRepository<PatientEntity, Integer> 
{
	@Query(value="SELECT * FROM patient WHERE id=:id and name=:name",nativeQuery=true)
    public List<PatientEntity> getAll(int id,String name);
}
