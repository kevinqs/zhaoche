package com.zhaoche.ws;

import java.util.Date;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;

import com.zhaoche.common.PhoneAccess;
import com.zhaoche.persistence.HibernateUtil;

// POJO, no interface no extends

//Sets the path to base URL + /hello
@Path("/phoneAccess")
public class PhoneAccessResource {
	
	// This method is called if TEXT_PLAIN is request
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}

	// This method is called if XMLis request
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}

	// This method is called if HTML is request
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String sayHtmlHello1() {
//		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
//				+ "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
//	}
	
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String sayHtmlHello() {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		 
//	    session.beginTransaction();
//	    PhoneAccess phoneAccess = new PhoneAccess();
//	    phoneAccess.setAccessTime(new Date()); 
//	    phoneAccess.setPhoneId("12345");
//	    phoneAccess.setAction("play");
//	    session.save(phoneAccess);
//	    session.getTransaction().commit();	
//	    return "success";
//		
//	}

	@GET
	@Path("{phoneId}/{action}")
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello(
			@PathParam("phoneId") String phoneId,
			@PathParam("action") String action
			) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
	    session.beginTransaction();
	    PhoneAccess phoneAccess = new PhoneAccess();
	    phoneAccess.setAccessTime(new Date()); 
	    phoneAccess.setPhoneId(phoneId);
	    phoneAccess.setAction(action);
	    session.save(phoneAccess);
	    session.getTransaction().commit();	
	    return "success1";
		
	}
}
