package com.practice.db.models.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
//@ToString(exclude = {""})
public class User {
	@Id
	@Column(name = "code")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID code;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pass")
	private String password;
	
	//@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	//@JsonIgnore
	//private List<> playlists;
	
	public User(UUID code, String username, String email, String password) {
		super();
		this.code = code;
		this.username = username;
		this.email = email;
		this.password = password;
	}
}