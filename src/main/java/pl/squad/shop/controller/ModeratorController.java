package pl.squad.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.squad.shop.model.Item;

import pl.squad.shop.service.ItemService;

@Controller
@RequestMapping("/moderator")
public class ModeratorController {
	
	private ItemService itemService;
	
	@Autowired
	public ModeratorController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}

	@GetMapping("/")
	public String moderator(Model model, Pageable pageable) {
		
		Page<Item> items= itemService.getAll(pageable);
		model.addAttribute("items", items);
		PageWrapper<Item> page = new PageWrapper<>(items, "/moderator/moderator/");
		model.addAttribute("page", page);
		return "moderator/moderator";
	}
}
