package net.mock.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import net.mock.dao.CMNDDAO;
import net.mock.dao.NhanKhauDAO;
import net.mock.entity.CMNDEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.hibernate.HibernateUtil;

@Controller

public class ToTruongController {
	@RequestMapping(value = "totruong")
	public String homePage(ModelMap mm) {

		mm.put("hello",
				"Hello, Welcome to Da Nang. Hoang Sa - Truong Sa belong to Viet Nam!!!.<br> HOÀNG SA TRƯỜNG SA LÀ CỦA VIỆT NAM");
		return "totruong";
	}

	@PostMapping(value = "addCMND")

	public String addCMND(@RequestParam("anh1") MultipartFile file, ModelMap mm, Model model,
			HttpServletRequest request, HttpSession ss) throws IOException {
		if (!file.isEmpty()) {
			try {
				String relativeWebPath = "/resources/images";
				String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
//			String absoluteFilePath = "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
				byte[] bytes = file.getBytes();

				File dir = new File(absoluteFilePath);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File uploadFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());

				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);

				outputStream.flush();

				outputStream.close();
				CMNDDAO cmnddao = new CMNDDAO();
				String cmnd = cmnddao.autoCMND();
				CMNDEntity cmnde = new CMNDEntity(cmnd, file.getOriginalFilename(), absoluteFilePath);
				HibernateUtil hu = new HibernateUtil();
				SessionFactory sf = hu.getSessionFactory();
				Session session = sf.openSession();
				session.beginTransaction();
				session.save(cmnde);
				CMNDEntity cmnde1 = session.get(CMNDEntity.class, cmnd);

				session.getTransaction().commit();

				mm.put("hello", cmnde1.getAnh1());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return "hello";

	}
//	   @RequestMapping(value = "hello")
//	   public String hello(ModelMap mm) {
//
//
//		
//			HibernateUtil hu = new HibernateUtil();
//			SessionFactory sf = hu.getSessionFactory();
//			Session session = sf.openSession();
//			session.beginTransaction();
//			CMNDEntity cmnde1 = session.get(CMNDEntity.class, "999678023055");
//			mm.put("anh", cmnde1.getAnh2()+ "\\" +cmnde1.getAnh1());
//			session.getTransaction().commit();
//	      return "hello";
//	   }	  

	@PostMapping(value = "getImgNK")
	public String getImageNhanKhau(@RequestParam("anh") MultipartFile file, ModelMap mm, Model model,
			HttpServletRequest request, HttpSession ss) throws IOException {
		if (!file.isEmpty()) {
			try {
				String relativeWebPath = "/resources/images";
				String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
//					String absoluteFilePath = "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
				byte[] bytes = file.getBytes();

				File dir = new File(absoluteFilePath);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File uploadFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());

				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);

				outputStream.flush();

				outputStream.close();
				NhanKhauDAO nkdao = new NhanKhauDAO();
				String nk = nkdao.autoNK();
				NhanKhauEntity nke = new NhanKhauEntity(nk, file.getOriginalFilename());
				HibernateUtil hu = new HibernateUtil();
				SessionFactory sf = hu.getSessionFactory();
				Session session = sf.openSession();
				session.beginTransaction();
				session.save(nke);
				NhanKhauEntity nkEntiry = session.get(NhanKhauEntity.class, nk);

				session.getTransaction().commit();

				mm.put("imgNK", nkEntiry.getAnh());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return "imgNK";

	}

}
