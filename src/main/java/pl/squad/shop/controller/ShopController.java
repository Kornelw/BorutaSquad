package pl.squad.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.squad.shop.model.Item;
import pl.squad.shop.repository.ItemRepository;

@Controller
public class ShopController {
	
	@GetMapping("/")
	public String index() {
		
//----------------kopia z itemListController		
//		private ItemRepository itemRepo;
//
//		@Autowired
//		public ItemListController(ItemRepository itemRepo) {
//			this.itemRepo = itemRepo;
//		}
//
//		public String itemList(Model model, Pageable pageable) {
//
//			
//
//			Page<Item> pageItem = itemService.getAll(pageable);
//			model.addAttribute("items", pageItem);
//			PageWrapper<Item> page = new PageWrapper<>(pageItem, "/");
//			model.addAttribute("item", item);
		
//----------------kopia z itemListController	
		
		
		// dorobic pobranie z bazy obiektu w postaci listy do wyswietlenia
		
		return "index";
	}
}
