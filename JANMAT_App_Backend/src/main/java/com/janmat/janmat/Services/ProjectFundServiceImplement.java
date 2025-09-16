package com.janmat.janmat.Services;

import com.janmat.janmat.models.ProjectFund;
import com.janmat.janmat.Repository.ProjectFundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectFundServiceImplement implements ProjectFundService {

	 @Autowired
	    private ProjectFundRepository projectFundRepository;

	    @Override
	    public ProjectFund saveProject(ProjectFund project) {
	        return projectFundRepository.save(project);
	    }

	    @Override
	    public List<ProjectFund> getAllProjects() {
	        return projectFundRepository.findAll();
	    }

	    @Override
	    public ProjectFund getProjectById(Long id) {
	        return projectFundRepository.findById(id).orElse(null);
	    }

	    @Override
	    public ProjectFund updateProject(Long id, ProjectFund updatedProject) {
	        ProjectFund existing = projectFundRepository.findById(id).orElse(null);
	        if (existing != null) {
	            existing.setMinister_id(updatedProject.getMinister_id());
	            existing.setMinister_name(updatedProject.getMinister_name());
	            existing.setDescription(updatedProject.getDescription());
	            existing.setStart_date(updatedProject.getStart_date());
	            existing.setEnd_date(updatedProject.getEnd_date());
	            existing.setAllocated_fund(updatedProject.getAllocated_fund());
	            existing.setAmmount_spent(updatedProject.getAmmount_spent());
	            existing.setStatus(updatedProject.getStatus());
	            return projectFundRepository.save(existing);
	        }
	        return null;
	    }

	    @Override
	    public void deleteProject(Long id) {
	        projectFundRepository.deleteById(id);
	    }
	}