package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardgameContrller {
	
	@RequestMapping(value="/boardgame", method=RequestMethod.GET)
	public String loadboardgamePage() {
		return "boardgame";
	}

}
