package test;

import java.util.List;

import dao.EtudiantDaoImpl;
import metier.entities.Etudiant;

public class TestDao {

	public static void main(String[] args) {
		EtudiantDaoImpl pdao= new EtudiantDaoImpl();
		Etudiant prod= pdao.save(new Etudiant("moussa","mayssa",
	    "2002-06-17","nabeul","mayssa@gmail.com",2024,"IT"));
		System.out.println(prod);
		List<Etudiant> etuds =pdao.etudiantParMC("k");
		for (Etudiant p : etuds)
		System.out.println(p);

	}

}
