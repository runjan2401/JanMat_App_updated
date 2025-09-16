package com.janmat.janmat.Controller;

import com.janmat.janmat.models.PublicOpinion;
import com.janmat.janmat.Services.PublicOpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/public-opinions")
@CrossOrigin("*")
public class PublicOpinionController {
	 @Autowired
	    private PublicOpinionService publicOpinionService;

	    @PostMapping
	    public PublicOpinion createOpinion(@RequestBody PublicOpinion opinion) {
	        return publicOpinionService.createOpinion(opinion);
	    }

	    @GetMapping
	    public List<PublicOpinion> getAllOpinions() {
	        return publicOpinionService.getAllOpinions();
	    }

	    @GetMapping("/{id}")
	    public PublicOpinion getOpinionById(@PathVariable Long id) {
	        return publicOpinionService.getOpinionById(id);
	    }

	    @PutMapping("/{id}")
	    public PublicOpinion updateOpinion(@PathVariable Long id, @RequestBody PublicOpinion updatedOpinion) {
	        return publicOpinionService.updateOpinion(id, updatedOpinion);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteOpinion(@PathVariable Long id) {
	        publicOpinionService.deleteOpinion(id);
	    }
	}
