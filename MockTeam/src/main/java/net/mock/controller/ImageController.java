//package net.mock.controller;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ByteArrayResource;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import net.mock.dao.CMNDDAO;
//import net.mock.entity.CMNDEntity;
//
//@Controller
//public class ImageController {
//	
//	@Autowired
//	private CMNDDAO cmndDao;
//	
//	@RequestMapping(value = "getimage/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	private ResponseEntity<ByteArrayResource> downloadLinkImage(@PathVariable String id){
//		
//		Optional<CMNDEntity> sop = Optional.of(cmndDao.getCMND(id));
//		
//		if(sop.isPresent()) {
//			CMNDEntity cmnd = sop.get();
//			try {
//				Path filename = Paths.get("images", cmnd.getAnh1());
//				byte[] buffer = Files.readAllBytes(filename);	
//				
//				ByteArrayResource bsr = new ByteArrayResource(buffer);
//				return	ResponseEntity.ok().contentLength(buffer.length).contentType(MediaType.parseMediaType("image/png")).body(bsr);
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//		return ResponseEntity.badRequest().build();
//	}
//}