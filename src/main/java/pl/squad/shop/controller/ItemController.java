package pl.squad.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
	
//	private ItemRepository itemRepo;
//
//	@Autowired
//	public ItemController(@Qualifier("itemRepository")ItemRepository itemRepo) {
//		this.itemRepo = itemRepo;
//	}

	public String item() {

		// dorobic pobranie z bazy obiektu

		return "item";
	}

}
