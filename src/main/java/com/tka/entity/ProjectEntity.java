package com.tka.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ProjectEntity {
 
	private Long id;
	private  String title;
	private String name;
	private String description;
	private String  language;
	private String repoitoryUrl;
//	@ManyToOne
//	private Set<Technology> technologies;
}
