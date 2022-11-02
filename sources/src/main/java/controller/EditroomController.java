package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditroomController {
	
	@RequestMapping(value="/editroom", method=RequestMethod.GET)
	public String loadeditroomPage() {
		return "editroom";
	}

}
