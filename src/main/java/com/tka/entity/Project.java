package com.tka.Entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Project {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private  String title;
	private String name;
	private String description;
	private String  language;
	private String repoitoryUrl;
	 private LocalDate createdDate;	
//@ManyToOne
//private Set<Technology> technologies;
}
