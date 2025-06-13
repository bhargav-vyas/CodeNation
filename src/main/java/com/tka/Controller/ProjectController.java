package com.tka.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.Project;
import com.tka.Service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	@PostMapping("/add")
	public  String addProject(@RequestBody Project project) {
        project.setCreatedDate(LocalDate.now());
        projectService.addProject(project);
        return "project added sucessful";
		
	}
	 @DeleteMapping("/delet/{id}")
	 public ResponseEntity<String> deletproject(@PathVariable Long id) {
		return projectService.delet(id);
	 }
	 
}
