package com.practice.db.models.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "users")
//@ToString(exclude = {""})
public class Playlist {
	@Id
	@Column(name = "code")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID code;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_code", nullable = true)
	private User user_code;

	public Playlist(UUID code, String title, String description, User user_code) {
		super();
		this.code = code;
		this.title = title;
		this.description = description;
		this.user_code = user_code;
	}
	
	//@OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	//@JsonIgnore
	//private List<BookLoan> bookLoans;
	
	
}