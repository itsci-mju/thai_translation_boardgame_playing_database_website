package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.*;
import manager.LoginManager;
import util.*;


@Controller
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value="/loadlogin", method=RequestMethod.GET)
	public String loadLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(HttpServletRequest request, Model md, HttpSession session) {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		System.out.println(uname);
		System.out.println(pwd);
		
		LoginMember lgmb =new  LoginMember();
		Login lg = new Login(uname,pwd,"");
		
		Login log = new Login();
		LoginManager mg = new LoginManager();
		
		String status=mg.verifyLogin(lg);
		
		if(log.equals("loginsus")) {
			mg.getLogin(uname);
		}else {
			return "index";
		}
		System.out.println(status);
		
		return uname;

			

}
}
