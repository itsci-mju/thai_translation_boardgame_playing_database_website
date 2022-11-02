package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditprofileController {
	
	@RequestMapping(value="/editprofile", method=RequestMethod.GET)
	public String loadprofilePage() {
		return "editprofile";
	}
	

}
