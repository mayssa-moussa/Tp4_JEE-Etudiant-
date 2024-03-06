package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.IEtudiantDao;
import dao.EtudiantDaoImpl;
import metier.entities.Etudiant;
@WebServlet (name="cs",urlPatterns= {"/controleur","*.do"})
public class ControleurServlet extends HttpServlet {
IEtudiantDao metier;
@Override
public void init() throws ServletException {
metier = new EtudiantDaoImpl();
}
@Override
protected void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
String path=request.getServletPath();
if (path.equals("/index.do"))
{
request.getRequestDispatcher("Etudiant.jsp").forward(request,response);
}
else if (path.equals("/chercher.do"))
{
String motCle=request.getParameter("motCle");
EtudiantModele model= new EtudiantModele();
model.setMotCle(motCle);
List<Etudiant> etuds = metier.etudiantParMC(motCle);
model.setEtudiants(etuds);
request.setAttribute("model", model);
request.getRequestDispatcher("Etudiant.jsp").forward(request,response);
}
else if (path.equals("/saisie.do") )
{
request.getRequestDispatcher("saisieEtudiant.jsp").forward(request,response);
}
else if (path.equals("/save.do") && request.getMethod().equals("POST"))
{
 String nom=request.getParameter("nom");
String prenom =request.getParameter("prenom");
String dateNaiss=request.getParameter("dateNaiss");
String adresse=request.getParameter("adresse");
String email=request.getParameter("email");
int Annee=Integer.parseInt(request.getParameter("annee-etudes"));

String dep=request.getParameter("dep");

Etudiant p = metier.save(new Etudiant(nom,prenom,dateNaiss,adresse,email,Annee,dep));
request.setAttribute("etudiant", p);
request.getRequestDispatcher("confirmation.jsp").forward(request,response);
}
else if (path.equals("/supprimer.do"))
{
 Long id= Long.parseLong(request.getParameter("id"));
 metier.deleteEtudiant(id);
 response.sendRedirect("chercher.do?motCle=");
}
else if (path.equals("/editer.do") )
{
	    Long id = Long.parseLong(request.getParameter("id"));
	    String nom = request.getParameter("nom");
	    String prenom = request.getParameter("prenom");
	    String dateNaiss = request.getParameter("dateNaiss");
	    String adresse = request.getParameter("adresse");
	    String email = request.getParameter("email");
	    //int Annee = Integer.parseInt(request.getParameter("anneeEtudes")); 
	    String anneeEtudesParam = request.getParameter("anneeEtudes");
	    int Annee = 0; // Valeur par défaut si le paramètre n'est pas défini ou ne peut pas être converti
	    if (anneeEtudesParam != null && !anneeEtudesParam.isEmpty()) {
	        try {
	            Annee = Integer.parseInt(anneeEtudesParam);
	        } catch (NumberFormatException e) {
	            // Gérer l'exception si la conversion échoue
	            e.printStackTrace(); // Vous pouvez également logger l'erreur
	        }
	    }

	    String dep = request.getParameter("dep");
	    Etudiant e = new Etudiant();
	    e.setIdEtudiant(id);
	    e.setNom(nom);
	    e.setPrenom(prenom);
	    e.setDateNaiss(dateNaiss);
	    e.setAdresse(adresse);
	    e.setEmail(email);
	    e.setAnneeEtudes(Annee);
	    e.setDep(dep);
	    metier.updateEtudiant(e);
	    request.setAttribute("etudiant", e);
request.getRequestDispatcher("confirmation.jsp").forward(request,response);
}
else
{
response.sendError(Response.SC_NOT_FOUND);
}
}
@Override
protected void doPost(HttpServletRequest request,
 HttpServletResponse response) throws
ServletException, IOException {
doGet(request,response);}
}


