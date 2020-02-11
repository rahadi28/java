package com.enigmacamp;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.enigmacamp.config.HibernateConfig;
import com.enigmacamp.model.Gender;
import com.enigmacamp.model.Student;

public class Main {
	private static void setGender() {
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trx = null;
		
		try {
			trx = session.beginTransaction();
			
			Gender genM = new Gender("M", "Male");
			Gender genF = new Gender("F", "Female");
			
			session.save(genM);
			session.save(genF);
			
			session.flush();
            session.clear();
			
			trx.commit();
		} catch (HibernateException e) {
			if (trx != null) trx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ;
	}
	
	private static void addStudent() {
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trx = null;
		
		try {
			trx = session.beginTransaction();
			
			for (int i = 0; i < 100; i++) {
				String name = "Winda " + i;
				String address = "Jl. H. Dahlan No. 75, Ragunan Jakarta";
				Gender gen = session.find(Gender.class, "F");
				
				Student std = new Student(name, address, gen);
				
				session.save(std);
				
				if( i % 50 == 0 ) { //50, same as the JDBC batch size
					//flush a batch of inserts and release memory
					session.flush();
		            session.clear();
		        }
			}
			trx.commit();
		} catch (HibernateException e) {
			if (trx != null) trx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ;
	}
	
	private static void getStudent() {
		Transaction trx = null;
		
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			trx = session.beginTransaction();
			
			List<Student> stds = session.createQuery("FROM Student", Student.class).list();
			stds.forEach(s -> System.out.println(s.getName()));
			
			session.flush();
            session.clear();
		} catch (HibernateException e) {
			if (trx != null) trx.rollback();
			e.printStackTrace();
		}
		return ;
	}

	public static void main(String[] args) {
		setGender();
		addStudent();
		getStudent();
	}
}