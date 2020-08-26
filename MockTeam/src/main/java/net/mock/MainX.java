package net.mock;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.dao.CMNDDAO;
import net.mock.entity.CMNDEntity;
import net.mock.entity.ToDanPhoEntity;
import net.mock.hibernate.HibernateUtil;

public class MainX {
	public static void main(String[] args) {
		CMNDDAO cmnddao = new CMNDDAO();

		CMNDEntity cmnde = new CMNDEntity(cmnddao.autoCMND(),"a","b");
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(cmnde);
		session.getTransaction().commit();
		sf.close();
	}
}
