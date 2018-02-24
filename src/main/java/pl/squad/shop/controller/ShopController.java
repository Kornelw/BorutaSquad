package pl.squad.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.squad.shop.model.Item;
import pl.squad.shop.service.ItemService;

@Controller
public class ShopController {

private ItemService itemService;
	
	@Autowired
	public ShopController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping("/")
	public String index(Model model, Pageable pageable) {

		Page<Item> pageItem = itemService.getAll(pageable);
		model.addAttribute("items", pageItem);
//		PageWrapper<Item> page = new PageWrapper<>(pageItem, "/");
//		model.addAttribute("page", page);
		
		return "index";
	}

}
