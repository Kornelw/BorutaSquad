package pl.squad.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
	
	@GetMapping("/")
	public String index() {
		
		// dorobic pobranie z bazy obiektu w postaci listy do wyswietlenia
		
		return "index";
	}

}
