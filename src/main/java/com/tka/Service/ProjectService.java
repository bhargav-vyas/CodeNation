package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tka.Entity.Project;
import com.tka.Entity.User;
import com.tka.Reporisetory.ProjectReporisetory;

@Service
public class ProjectService {
@Autowired 
  private ProjectReporisetory projectReporisetory;

	public void addProject(Project project) {
		projectReporisetory.save(project);
		
	}

	public String delet(Long id) {	
		projectReporisetory.deleteById(id);
		return "deleted scussfully";
	}

	public static Project getuserByid(Long id) {
		return projectReporisetory.getById(id);
		 
	}

	

}
