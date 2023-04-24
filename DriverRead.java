package OneToMany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import OneToMany.dto.Branch1;
import OneToMany.dto.Hospital1;

public class DriverRead 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Branch1 branch = entityManager.find(Branch1.class,2);
		System.out.println(branch);
		
//		Hospital1 hp = entityManager.find(Hospital1.class,1);
//		System.out.println(hp);
	}
}
