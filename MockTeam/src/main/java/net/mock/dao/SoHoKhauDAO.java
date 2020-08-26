
package net.mock.dao;



import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import net.mock.entity.SoHoKhauEntity;
import net.mock.hibernate.HibernateUtil;

public class SoHoKhauDAO {
	public String autoSHK(){
		String auto = null;
		
		while (getSoHoKhau(auto)==null) {
			
		
		Random generator = new Random();
		int i = generator.nextInt(100000);
		if(i<10) auto = "DNSHK0000"+i;
		else if(i<100 && i>9) auto = "DNSHK000"+i;
		else if(i<1000 && i>99) auto = "DNSHK00"+i;
		else if(i<10000 && i>999) auto = "DNSHK0"+i;
		else if(i<100000 && i>9999) auto = "DNSHK"+i;
	
	return auto;
		}
		return auto;
	}
// public SoHoKhauEntity getSoHoKhau(String id_shk) {
//
//	SoHoKhauEntity shke = null;
//	HibernateUtil hu = new HibernateUtil();
//	SessionFactory sf= hu.getSessionFactory();
//	try (Session session = sf.openSession()){
//		session.beginTransaction();
//		
//		shke = (SoHoKhauEntity) session.createQuery("from SoHoKhauEntity shk where shk.id_shk=:id_shk",SoHoKhauEntity.class).setParameter("id_shk", id_shk).uniqueResult();
//		
//		session.getTransaction().commit();
////		sf.close();
//		return shke;
//	} catch (Exception e) {
//	
//	e.printStackTrace();
//	return null;
//	
//}
//	}	public SoHoKhauEntity getSoHoKhau(String id_shk) {
		SoHoKhauEntity shke = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		shke = session.get(SoHoKhauEntity.class, id_shk);
		session.getTransaction().commit();
//		sf.close();
		return shke;
	
	}
public boolean checkSHK(String id_shk,String idCH) {
	SoHoKhauEntity shke = getSoHoKhau(id_shk);
	if(shke != null && shke.getIdCH().equals(idCH)) {
		
		return true;
	}
	else return false;
}
public boolean checkSHKCMND(String id_shk,String cmnd) {

	SoHoKhauDAO shkd= new SoHoKhauDAO();
	NhanKhauDAO nkd = new NhanKhauDAO();

	SoHoKhauEntity shke = null;
	boolean x = false;


	shke = shkd.getSoHoKhau(nkd.getNhanKhauCMND(cmnd).getSoHoKhau().getId_shk());

	if(id_shk.equals(shke.getId_shk())) x= true;
	
	return x;
	
}
public static void main(String[] args) {
//	
//
//	// TODO Auto-generated method stub
	SoHoKhauDAO shka = new SoHoKhauDAO();
//	System.out.println(shka.autoSHK());
//	SoHoKhauEntity shke = shka.getSoHoKhau("DNSHK00000");
//	System.out.println(shke.getIdCH());
//	if(shka.checkSHK("DNSHK00000", "DNNK000000")) System.out.println("ok");
//	else System.out.println("e");
	
//}
	if(shka.checkSHKCMND("DNSHK00000", "032842558642")==true) System.out.println("ok");
}
}
