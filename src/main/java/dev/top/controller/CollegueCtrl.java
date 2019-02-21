package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@RestController
@CrossOrigin
@RequestMapping("/collegues")
public class CollegueCtrl {
	
	@Autowired
	private CollegueRepo collegueRepo;
	
	@GetMapping
	public List<Collegue> findAll(){
		return this.collegueRepo.findAll();
		
	}
	
	@PostMapping
	public void creerCollegue(@RequestBody CreerCollegueForm creerCollegueForm) {
		// restTemplate
		System.out.println(creerCollegueForm);
		
	}
	

}
