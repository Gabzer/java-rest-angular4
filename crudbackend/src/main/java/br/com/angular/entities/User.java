package br.com.angular.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import lombok.Data;

@Entity
@Data
public class User {
	
	public User(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public User() { }
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String fname;
	
	private String lname;
	
}
