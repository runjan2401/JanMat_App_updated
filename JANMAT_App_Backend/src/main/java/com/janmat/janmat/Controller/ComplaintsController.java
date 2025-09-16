package com.janmat.janmat.Controller;

import com.janmat.janmat.models.Complaints;
import com.janmat.janmat.Services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin("*")
public class ComplaintsController {
	@Autowired
    private ComplaintService complaintsService;

    @PostMapping
    public Complaints createComplaint(@RequestBody Complaints complaint) {
        return complaintsService.saveComplaint(complaint);
    }

    @GetMapping
    public List<Complaints> getAllComplaints() {
        return complaintsService.getAllComplaints();
    }

    @GetMapping("/{id}")
    public Complaints getComplaintById(@PathVariable Long id) {
        return complaintsService.getComplaintById(id);
    }

    @PutMapping("/{id}")
    public Complaints updateComplaint(@PathVariable Long id, @RequestBody Complaints complaint) {
        return complaintsService.updateComplaint(id, complaint);
    }

    @DeleteMapping("/{id}")
    public void deleteComplaint(@PathVariable Long id) {
        complaintsService.deleteComplaint(id);
    }
}

