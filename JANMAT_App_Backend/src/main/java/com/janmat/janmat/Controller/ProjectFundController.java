package com.janmat.janmat.Controller;

import com.janmat.janmat.models.ProjectFund;
import com.janmat.janmat.Services.ProjectFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project-fund")
@CrossOrigin("*")
public class ProjectFundController {
	 @Autowired
	    private ProjectFundService projectFundService;

	    @PostMapping
	    public ProjectFund createProject(@RequestBody ProjectFund project) {
	        return projectFundService.saveProject(project);
	    }

	    @GetMapping
	    public List<ProjectFund> getAllProjects() {
	        return projectFundService.getAllProjects();
	    }

	    @GetMapping("/{id}")
	    public ProjectFund getProjectById(@PathVariable Long id) {
	        return projectFundService.getProjectById(id);
	    }

	    @PutMapping("/{id}")
	    public ProjectFund updateProject(@PathVariable Long id, @RequestBody ProjectFund updatedProject) {
	        return projectFundService.updateProject(id, updatedProject);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProject(@PathVariable Long id) {
	        projectFundService.deleteProject(id);
	    }
	}

