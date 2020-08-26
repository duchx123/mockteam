package net.mock.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import net.mock.entity.ToTruongEntity;
import net.mock.hibernate.HibernateUtil;

public class ToTruongDAO {
	
	
	 public ToTruongEntity getUsername(String username , String pw ) {

		 ToTruongEntity tt = null;
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf= hu.getSessionFactory();
			try (Session session = sf.openSession()){
				session.beginTransaction();
				
				tt = (ToTruongEntity) session.createQuery("from totruong tt where tt.username=:username",ToTruongEntity.class).setParameter("username", username).uniqueResult();
				
				session.getTransaction().commit();
//				sf.close();
				return tt;
			} catch (Exception e) {
			
			e.printStackTrace();
			return null;
			
		}

	 }}
