package com.janmat.janmat.Controller;

import com.janmat.janmat.models.ComplaintsResponse;
import com.janmat.janmat.Services.ComplaintResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaint-responses")
@CrossOrigin("*")
public class ComplaintResponseController {
	@Autowired
    private ComplaintResponseService complaintsResponseService;

    @PostMapping
    public ComplaintsResponse createResponse(@RequestBody ComplaintsResponse response) {
        return complaintsResponseService.saveResponse(response);
    }

    @GetMapping
    public List<ComplaintsResponse> getAllResponses() {
        return complaintsResponseService.getAllResponses();
    }

    @GetMapping("/{id}")
    public ComplaintsResponse getResponseById(@PathVariable Long id) {
        return complaintsResponseService.getResponseById(id);
    }

    @PutMapping("/{id}")
    public ComplaintsResponse updateResponse(@PathVariable Long id, @RequestBody ComplaintsResponse response) {
        return complaintsResponseService.updateResponse(id, response);
    }

    @DeleteMapping("/{id}")
    public void deleteResponse(@PathVariable Long id) {
        complaintsResponseService.deleteResponse(id);
    }
}

