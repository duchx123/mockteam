package net.mock.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.mock.dao.NhanKhauDAO;
import net.mock.dao.SoHoKhauDAO;
import net.mock.entity.CMNDEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.entity.SoHoKhauEntity;


import net.mock.hibernate.HibernateUtil;
import net.mock.ma.SHKModelAttribute;



@Controller
public class UserController {


  
   @RequestMapping(value = "home")
   public String homePage(ModelMap mm) {

		/*
		 * mm.put("hello",
		 * "Hello, Welcome to Da Nang. Hoang Sa - Truong Sa belong to Viet Nam!!!.<br>"
		 * );
		 */
      return "home";
   }  
   
   @RequestMapping(value = "mainhome")
   public String mainHome(ModelMap mm,HttpSession session ) {
	   session.setAttribute("session", "mainhome");
	  
      return "mainhome";
   }  

@RequestMapping( value = "login", method = RequestMethod.POST)
   public String login(@ModelAttribute(value="shk") SHKModelAttribute shke, ModelMap mm, HttpSession session) {
	   SoHoKhauDAO shkd = new SoHoKhauDAO();
	   if(shkd.checkSHKCMND(shke.getShk(),shke.getSoCMND())) {
		   SoHoKhauEntity shk = shkd.getSoHoKhau(shke.getShk());
		   mm.put("shke", shk);
		   NhanKhauDAO nkd = new NhanKhauDAO();
		   nkd.getNhanKhau(shk.getId_shk());
		   mm.put("nkde", nkd);
		List<NhanKhauEntity> list = nkd.listNhanKhauSHK(shk.getId_shk());
		   mm.put("list", list);
			   
		   return "hokhau";
		   
	   }

	   else {
		   mm.put("hello", "sai");
//		   String myURI = request.getAttribute("javax.servlet.forward.request_uri").toString();
		   String x = (String) session.getAttribute("session");
		   return x;
//		   return new UrlPathHelper().getOriginatingRequestUri(request);
	   }
	   
   }
   @RequestMapping(value = "view")
   public String viewNK( @ModelAttribute(value="id") String id_nk, ModelMap mm, HttpSession ss) {

	   	NhanKhauEntity nke = new NhanKhauEntity();
	   	CMNDEntity cmnde = new CMNDEntity();
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		nke = session.get(NhanKhauEntity.class, id_nk);
	
		cmnde =  nke.getSoCMND();
		mm.put("nke", nke);
		mm.put("cmnde",cmnde);
		session.getTransaction().commit();
//		sf.close();
		ss.setAttribute("session", "viewNK");
      return "viewNK";
   }  
   
   @RequestMapping(value = "viewCMND")
   public String viewCMND( @ModelAttribute(value="id") String soCMND, ModelMap mm, HttpSession ss) {

	   	CMNDEntity cmnde = new CMNDEntity();
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		cmnde = session.get(CMNDEntity.class, soCMND);
	NhanKhauDAO nkd = new NhanKhauDAO();
	NhanKhauEntity nke = nkd.getNhanKhauCMND(soCMND);
	mm.put("nke", nke);
	SoHoKhauEntity shke = nke.getSoHoKhau();
	SoHoKhauDAO shkd = new SoHoKhauDAO();
	shke = shkd.getSoHoKhau(shke.getId_shk());
	mm.put("shke", shke);
		mm.put("cmnde",cmnde);
		session.getTransaction().commit();
//		sf.close();
	      return "viewCMND";
   } 
  
   
   
   
}