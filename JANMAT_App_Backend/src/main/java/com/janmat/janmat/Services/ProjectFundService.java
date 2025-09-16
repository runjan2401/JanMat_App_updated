package com.janmat.janmat.Services;

import com.janmat.janmat.models.ProjectFund;
import java.util.List;

public interface ProjectFundService {
	 ProjectFund saveProject(ProjectFund project);
	    List<ProjectFund> getAllProjects();
	    ProjectFund getProjectById(Long id);
	    ProjectFund updateProject(Long id, ProjectFund updatedProject);
	    void deleteProject(Long id);
}
