package metier.entities;

import java.io.Serializable;
public class Etudiant implements Serializable{
private Long idEtudiant;
private String nom;
private String prenom;
private String dateNaiss;
private String adresse;
private String email;
private int anneeEtudes;
private String dep;
public Etudiant() {
super();
}
public Etudiant(String nom,String prenom,String dateNaiss,String adresse,String email,
		int anneeEtudes,String dep) {
super();
this.setNom(nom);
this.setPrenom(prenom);
this.setDateNaiss(dateNaiss);
this.setAdresse(adresse);
this.setEmail(email);
this.setAnneeEtudes(anneeEtudes);
this.setDep(dep);
}
public Long getIdEtudiant() {
	return idEtudiant;
}
public void setIdEtudiant(Long idEtudiant) {
	this.idEtudiant = idEtudiant;
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
public String getDateNaiss() {
	return dateNaiss;
}
public void setDateNaiss(String dateNaiss) {
	this.dateNaiss = dateNaiss;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAnneeEtudes() {
	return anneeEtudes;
}
public void setAnneeEtudes(int anneeEtudes) {
	this.anneeEtudes = anneeEtudes;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
@Override
public String toString() {
	return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss
			+ "\n, adresse=" + adresse + ", email=" + email + ", anneeEtudes=" + anneeEtudes + ", dep=" + dep + "]";
}

}
