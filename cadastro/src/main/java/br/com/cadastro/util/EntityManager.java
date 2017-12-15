package br.com.cadastro.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManager {

	private static EntityManagerFactory entityManagerFactory;
	
	static{
		entityManagerFactory = Persistence.createEntityManagerFactory("portifolio");
	}
	
	public static javax.persistence.EntityManager createEntityManager(){
		return entityManagerFactory.createEntityManager();
	}
}
