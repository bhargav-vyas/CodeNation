package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Entity.Project;
import com.tka.Reporisetory.ProjectReporisetory;

@Service
public class ProjectService {
@Autowired 
  private ProjectReporisetory projectReporisetory;

	public void addProject(Project project) {
		projectService.save(project);
		
	}

	

}
