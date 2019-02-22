package dev.top.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collegue {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
	private String pseudo;
	
	@Column 
	private int score;
	
	@Column
	private String photoURL;
	
	@Column
	private String email;
	
	@Column
	private String matricule;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	public Collegue(String pseudo, int score, String photoURL, String email, String matricule, String nom,
			String prenom) {
		super();
		this.pseudo = pseudo;
		this.score = score;
		this.photoURL = photoURL;
		this.email = email;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Collegue(Integer id, String pseudo, int score, String photoURL, String email, String matricule, String nom,
			String prenom) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.score = score;
		this.photoURL = photoURL;
		this.email = email;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public Collegue(String pseudo, int score, String photoURL) {
		super();
		this.pseudo = pseudo;
		this.score = score;
		this.photoURL = photoURL;
	}

	public Collegue() {
		super();
	}

	public Collegue(Integer id, String pseudo, int score, String photoURL) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.score = score;
		this.photoURL = photoURL;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}
	
	
}
