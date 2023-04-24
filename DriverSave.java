package OneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToMany.dto.Branch1;
import OneToMany.dto.Hospital1;

public class DriverSave 
{
	public static void main(String[] args) 
	{
		Hospital1 hospital = new Hospital1();
		hospital.setId(1);
		hospital.setName("Sasun");
		
		Branch1 b1 = new Branch1();
		b1.setId(1);
		b1.setAddress("NanaPeth");
		b1.setPhone(12345678);
		b1.setHospital(hospital);
		
		Branch1 b2 = new Branch1();
		b2.setId(2);
		b2.setAddress("Kothrud");
		b2.setPhone(12349867);
		b2.setHospital(hospital);
		
		List<Branch1> branch = new ArrayList<Branch1>();
		branch.add(b1);
		branch.add(b2);
		hospital.setBranches(branch);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(hospital);
		entityTransaction.commit();
	}
}
