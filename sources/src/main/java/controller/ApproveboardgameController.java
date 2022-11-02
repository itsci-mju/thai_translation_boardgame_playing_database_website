package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApproveboardgameController {
	
	@RequestMapping(value="/approveboardgame", method=RequestMethod.GET)
	public String loadapproveboardgamePage() {
		return "approveboardgame";
	}

}
