
package net.mock.dao;



import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.CMNDEntity;

import net.mock.hibernate.HibernateUtil;

public class CMNDDAO {
	public String autoCMND(){
		String auto = null;
		
		while (getCMND(auto)==null) {
			
		
		Random generator = new Random();
		int i = generator.nextInt(1000000000);
		if(i<10) auto = "99900000000"+i;
		else if(i<100 && i>9) auto = "9990000000"+i;
		else if(i<1000 && i>99) auto = "999000000"+i;
		else if(i<10000 && i>999) auto = "99900000"+i;
		else if(i<100000 && i>9999) auto = "9990000"+i;
		else if(i<1000000 && i>99999) auto = "999000"+i;
		else if(i<10000000 && i>999999) auto = "99900"+i;
		else if(i<100000000 && i>9999999) auto = "9990"+i;
		else if(i<1000000000 && i>99999999) auto = "999"+i;
	return auto;
		}
		return auto;
	}
 public CMNDEntity getCMND(String so_cmnd) {

	CMNDEntity cmnde = null;
	HibernateUtil hu = new HibernateUtil();
	SessionFactory sf= hu.getSessionFactory();
	try (Session session = sf.openSession()){
		session.beginTransaction();
		
		cmnde = (CMNDEntity) session.createQuery("from CMNDEntity cmnd where cmnd.so_cmnd=:so_cmnd",CMNDEntity.class).setParameter("so_cmnd", so_cmnd).uniqueResult();
		
		session.getTransaction().commit();
//		sf.close();
		return cmnde;
	} catch (Exception e) {
	
	e.printStackTrace();
	return null;
	
}
	}
public static void main(String[] args) {
	CMNDDAO cmndd= new CMNDDAO();
	System.out.println(cmndd.getCMND("999232323232").getNote());
	System.out.println(cmndd.autoCMND());
}
}
