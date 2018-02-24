package pl.squad.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.squad.shop.repository.ItemRepository;

@Controller
@RequestMapping("/itemList")
public class ItemListController {

	private ItemRepository itemRepo;

	@Autowired
	public ItemListController(ItemRepository itemRepo) {
		this.itemRepo = itemRepo;
	}

	public String itemList() {

		// dorobic pobranie z bazy obiektu w postaci listy do wyswietlenia

		return "itemList";
	}

}
