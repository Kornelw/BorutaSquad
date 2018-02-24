package pl.squad.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//adnotacja informuje Spirnga że to ma być encja - tabela w bazie danych
@Entity
@Table(name = "item")
public class Item {

	// klucz główny
	@Id
	// autoinkrementacja
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String description;

	private Double price;

}
