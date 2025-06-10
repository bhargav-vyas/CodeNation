package com.tka.Reporisetory;

import org.springframework.boot.autoconfigure.web.servlet.JerseyApplicationPath;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Entity.Project;

public interface ProjectReporisetory extends JpaRepository<Project, Long> {

}
