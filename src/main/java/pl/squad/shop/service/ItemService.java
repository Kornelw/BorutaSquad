package pl.squad.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import pl.squad.shop.model.Item;
import pl.squad.shop.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepo;

	public Item save(Item item) {
		return itemRepo.save(item);
	}

	public Page<Item> getAll(Pageable pageable) {
		
		Page<Item> items= itemRepo.findAll(pageable);	
		return items;
	}
	
	public Item findById(long id) {
		return itemRepo.findOne(id);
	}
	
	public Item getFirst() {
		return itemRepo.findAllByOrderByNameDesc();
	}

}
