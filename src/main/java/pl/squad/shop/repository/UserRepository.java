package pl.squad.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.squad.shop.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}
