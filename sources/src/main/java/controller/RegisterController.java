package controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.*;
import manager.*;
import util.*;

@Controller
public class RegisterController {

	public RegisterController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/loadregister", method=RequestMethod.GET)
	public String loadRegisterPage() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String do_register(HttpServletRequest request) throws Exception {

		List<FileItem> data = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
		Date da = new  Date();
	
		SimpleDateFormat sm = new SimpleDateFormat("yyyyMMddSSS");
		
		
		String name =data.get(0).getString();
		String password =data.get(1).getString();
		String birthday =data.get(3).getString();
		String phone =data.get(4).getString();
		String email =data.get(5).getString();
		String memberimages = new File(data.get(6).getName()).getName();
		String ranked_result ="0";
		String status ="Member";
		String Filename = "Member_"+sm.format(da);
		
		String path = request.getSession().getServletContext().getRealPath("/") + "//WEB-INF//img//";
		data.get(6).write(new File(path + File.separator + Filename));
		
		System.out.println(Filename);
		
		
		LocalDate date = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy-MM-d").withChronology(ThaiBuddhistChronology.INSTANCE));
		
		
		Member mb = new Member(name,password,date,phone,email,Filename,ranked_result,status);
		LoginMember lm = new LoginMember(name,mb);
		Login lo = new Login(lm,password,"สมาชิก");
		RegisterManager rm = new RegisterManager();
	    mb.setLg(lo);
		String m=rm.doSignUp(mb);
		LoginManager r = new LoginManager();
		
	//	System.out.println(m);
		String n=r.doSignUpLogin(lo);
		
		
		return "login";
		
	}
	
	

}
