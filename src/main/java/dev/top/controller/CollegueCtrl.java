package dev.top.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(creerCollegueForm);
		CollegueApi[] result = restTemplate.getForObject("https://tommy-sjava.cleverapps.io/collegues?matricule="+creerCollegueForm.getMatricule(), CollegueApi[].class);
		System.out.println(Arrays.toString(result));
		
	    Collegue col = new Collegue();
	    col.setMatricule(result[0].getMatricule());
	    col.setEmail(result[0].getEmail());
	    col.setNom(result[0].getNom());
	    col.setPrenom(result[0].getPrenom());
	    col.setPhotoURL(result[0].getPhoto());
	    col.setPseudo(result[0].getPseudo());
	   
	    collegueRepo.save(col);
		
	}
	

}
