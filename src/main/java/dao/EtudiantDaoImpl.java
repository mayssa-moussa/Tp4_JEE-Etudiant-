package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.entities.SingletonConnection;
import metier.entities.Etudiant;
public class EtudiantDaoImpl implements IEtudiantDao {
@Override
public Etudiant save(Etudiant p) {
Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("INSERT INTO ETUDIANTS(NOM,PRENOM,DATENAISS,ADRESSE,EMAIL,ANNEE_ETUDES,DEPARTEMENT) VALUES(?,?,?,?,?,?,?)");
ps.setString(1, p.getNom());
ps.setString(2, p.getPrenom());
ps.setString(3, p.getDateNaiss());
ps.setString(4, p.getAdresse());
ps.setString(5, p.getEmail());
ps.setInt(6, p.getAnneeEtudes());
ps.setString(7, p.getDep());
ps.executeUpdate();
PreparedStatement ps2= conn.prepareStatement
("SELECT MAX(ID_ETUDIANT) as MAX_ID FROM ETUDIANTS");
ResultSet rs =ps2.executeQuery();
if (rs.next()) {
p.setIdEtudiant(rs.getLong("MAX_ID"));
}
ps.close();
ps2.close();
} catch (SQLException e) {
e.printStackTrace();
}
return p;
}
@Override
public List<Etudiant> etudiantParMC(String mc) {
 List<Etudiant> etuds= new ArrayList<Etudiant>();
 Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("select * from ETUDIANTS where NOM LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Etudiant p = new Etudiant();
p.setIdEtudiant(rs.getLong("ID_ETUDIANT"));
p.setNom(rs.getString("NOM"));
p.setPrenom(rs.getString("PRENOM"));
p.setDateNaiss(rs.getString("DATENAISS"));
p.setAdresse(rs.getString("ADRESSE"));
p.setEmail(rs.getString("EMAIL"));
p.setAnneeEtudes(rs.getInt("ANNEE_ETUDES"));
p.setDep(rs.getString("DEPARTEMENT"));
etuds.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return  etuds;
}
@Override
public Etudiant getEtudiant(Long id) {

 Connection conn=SingletonConnection.getConnection();
 Etudiant p = new Etudiant();
 try {
PreparedStatement ps= conn.prepareStatement("select * from ETUDIANTS where ID_ETUDIANT = ?");
ps.setLong(1, id);
ResultSet rs = ps.executeQuery();
if (rs.next()) {
	p.setIdEtudiant(rs.getLong("ID_ETUDIANT"));
	p.setNom(rs.getString("NOM"));
	p.setPrenom(rs.getString("PRENOM"));
	p.setDateNaiss(rs.getString("DATENAISS"));
	p.setAdresse(rs.getString("ADRESSE"));
	p.setEmail(rs.getString("EMAIL"));
	p.setAnneeEtudes(rs.getInt("ANNEE_ETUDES"));
	p.setDep(rs.getString("DEPARTEMENT"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return p;
}
@Override
public Etudiant updateEtudiant(Etudiant p) {
Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("UPDATE ETUDIANTS SET NOM=?,PRENOM=?,DATENAISS=?,ADRESSE=?,EMAIL=?,ANEE_ETUDES=?,DEPARTEMENT=? WHERE ID_ETUDIANT=?");
ps.setString(1, p.getNom());
ps.setString(2, p.getPrenom());
ps.setString(3,p.getDateNaiss());
ps.setString(4, p.getAdresse());
ps.setString(5, p.getEmail());
ps.setInt(6, p.getAnneeEtudes());
ps.setString(7, p.getDep());
ps.setLong(8, p.getIdEtudiant());
ps.executeUpdate();
ps.close();
} catch (SQLException e) {
e.printStackTrace();
}
return p;
}
@Override
public void deleteEtudiant(Long id) {
Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("DELETE FROM ETUDIANTS WHERE ID_ETUDIANT = ?");
ps.setLong(1, id);
ps.executeUpdate();
ps.close();
} catch (SQLException e) {
e.printStackTrace();
}
}
}
