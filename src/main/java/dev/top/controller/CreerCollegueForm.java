package dev.top.controller;

public class CreerCollegueForm {
	private String matricule;
	private String  pseudo;
	private String  urlImage;
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	@Override
	public String toString() {
		return "CreerCollegueForm [matricule=" + matricule + ", pseudo=" + pseudo + ", urlImage=" + urlImage + "]";
	}
	
	
	
	
}
