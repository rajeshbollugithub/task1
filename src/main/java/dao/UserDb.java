package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.UserData;


public class UserDb {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("yelender");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertEmployee(UserData userData ) {
		entityTransaction.begin();
		entityManager.persist(userData);
		entityTransaction.commit();
	}
	public List fetch() {
		Query query=entityManager.createQuery("select u from UserData u");
		List data=query.getResultList();
		return data;
	}
}
