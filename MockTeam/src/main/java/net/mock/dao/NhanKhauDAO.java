package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.CMNDEntity;
import net.mock.entity.NhanKhauEntity;

import net.mock.hibernate.HibernateUtil;

public class NhanKhauDAO {
	public List<NhanKhauEntity> listNhanKhauSHK(String id_SHK) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

		List<NhanKhauEntity> list = session.createQuery("from NhanKhauEntity nk where nk.soHoKhau='"+id_SHK+"'",NhanKhauEntity.class).list();
		return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		
	}
	public String autoNK(){
		String auto = null;
		
		while (getNhanKhau(auto)==null) {
			
		
		Random generator = new Random();
		int i = generator.nextInt(1000000);
		if(i<10) auto = "DNNK00000"+i;
		else if(i<100 && i>9) auto = "DNNK0000"+i;
		else if(i<1000 && i>99) auto = "DNNK000"+i;
		else if(i<10000 && i>999) auto = "DNNK00"+i;
		else if(i<100000 && i>9999) auto = "DNNK0"+i;
		else if(i<1000000 && i>99999) auto = "DNNK"+i;
	
	return auto;
		}
		return auto;
	}
 public NhanKhauEntity getNhanKhau(String id_nk) {

	NhanKhauEntity nke = null;
	HibernateUtil hu = new HibernateUtil();
	SessionFactory sf= hu.getSessionFactory();
	try (Session session = sf.openSession()){
		session.beginTransaction();
		
		nke = (NhanKhauEntity) session.createQuery("from NhanKhauEntity nk where nk.id_nk=:id_nk",NhanKhauEntity.class).setParameter("id_nk", id_nk).uniqueResult();
		
		session.getTransaction().commit();
//		sf.close();
		return nke;
	} catch (Exception e) {
	
	e.printStackTrace();
	return null;
	
}
	
	}
 public NhanKhauEntity getNhanKhauCMND(String cmnd) {

	NhanKhauEntity nke = null;
	HibernateUtil hu = new HibernateUtil();
	SessionFactory sf= hu.getSessionFactory();
	try (Session session = sf.openSession()){
		session.beginTransaction();
		CMNDEntity soCMND = session.get(CMNDEntity.class, cmnd);
		nke = (NhanKhauEntity) session.createQuery("from NhanKhauEntity nk where nk.soCMND=:soCMND",NhanKhauEntity.class).setParameter("soCMND", soCMND).uniqueResult();
		
		session.getTransaction().commit();
//		sf.close();
		return nke;
	} catch (Exception e) {
	
	e.printStackTrace();
	return null;
	
}
	}
public static void main(String[] args) {
	NhanKhauDAO nkd = new NhanKhauDAO();
//	System.out.println(nkd.getNhanKhauCMND("032842123456").getNoiSinh());
System.out.println(nkd.getNhanKhauCMND("032842123456").getNoiSinh());
	
}

}
