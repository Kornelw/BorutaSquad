package pl.squad.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.squad.shop.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByRole(String role);

}
