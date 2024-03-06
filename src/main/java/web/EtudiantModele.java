package web;

import java.util.ArrayList;
import java.util.List;
import metier.entities.Etudiant;
public class EtudiantModele {
private String motCle;
List<Etudiant> etudiants = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Etudiant> getEtudiants() {
return etudiants;
}
public void setEtudiants(List<Etudiant> etudiants) {
this.etudiants = etudiants;
}
}
