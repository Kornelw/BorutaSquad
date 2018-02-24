package pl.squad.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Email;




@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;

	@Column(unique=true)
	
	@Email
	private String email;
	
	private String password;
	
	private boolean active;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	public User() {
		super();
	}

	public User(String email, String name, String lastName, Role role) {
		super();
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.role = role;
	}

	public User(long id, String email, String name, String lastName, Role role) {
		super();
		Id = id;
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.role = role;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", email=" + email + ", name=" + name + ", lastName=" + lastName + ", role=" + role
				+ "]";
	}

	public void setRole(Role role) {
		this.role = role;
	}

	private String name;

	private String lastName;

	public void setActive(boolean b) {
		this.active = true;
		
	}

	public CharSequence getPassword() {
		return null;
	}

	public void setPassword(String encode) {
		
		
	}

	public void setPassword(CharSequence password2) {
	
		
	}
	
}
