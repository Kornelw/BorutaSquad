package pl.squad.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.squad.shop.repository.ItemRepository;
import pl.squad.shop.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	private ItemService itemService;
	private ItemRepository itemRepo;

	public ItemController(ItemService itemService, ItemRepository itemRepo) {
		super();
		this.itemRepo = itemRepo;
		this.itemService = itemService;
		}

	public String item() {

		// dorobic pobranie z bazy obiektu

		return "item";
	}

}
