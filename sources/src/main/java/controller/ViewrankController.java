package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewrankController {
	
	@RequestMapping(value="/rank", method=RequestMethod.GET)
	public String loadrankPage() {
		return "viewrank";
	}

}
