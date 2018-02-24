package pl.squad.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.squad.shop.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	
	Item findAllByOrderByNameDesc();

}
