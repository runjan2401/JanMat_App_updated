package com.janmat.janmat.Controller;

import com.janmat.janmat.models.Ministers;
import com.janmat.janmat.Services.MinisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ministers")
@CrossOrigin("*")
public class MinisterController {
	 @Autowired
	    private MinisterService ministersService;

	    @PostMapping
	    public Ministers createMinister(@RequestBody Ministers minister) {
	        return ministersService.saveMinister(minister);
	    }

	    @GetMapping
	    public List<Ministers> getAllMinisters() {
	        return ministersService.getAllMinisters();
	    }

	    @GetMapping("/{id}")
	    public Ministers getMinisterById(@PathVariable Long id) {
	        return ministersService.getMinisterById(id);
	    }

	    @PutMapping("/{id}")
	    public Ministers updateMinister(@PathVariable Long id, @RequestBody Ministers minister) {
	        return ministersService.updateMinister(id, minister);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteMinister(@PathVariable Long id) {
	        ministersService.deleteMinister(id);
	    }
	}

