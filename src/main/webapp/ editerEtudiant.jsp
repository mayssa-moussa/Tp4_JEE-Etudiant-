<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="header.jsp" %>
<p></p>
<div class="container">
<div class="card">
<div class="card-header">
Modification des Etudiants
</div>
<div hidden class="card-body">
<form action="update.do" method="post">
<div class="form-group">
<label class="control-label">ID Etudiant :</label>
<input type="text" name="id" class="form-control"
value="${etudiant.idEtudiant}"/>
</div>
<div class="form-group">
 <label class="control-label">Nom:</label>
 <input type="text" name="nom" class="form-control"
 value="${etudiant.nom}"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prenom:</label>
 <input type="text" name="prenom" class="form-control"
 value="${etudiant.prenom}"/>
 </div>
 <div class="form-group">
 <label class="control-label">Date de naissance:</label>
 <input type="date" name="dateNaiss" class="form-control"
 value="${etudiant.dateNaiss}"/>
 </div>
 <div class="form-group">
 <label class="control-label">Adresse:</label>
 <input type="text" name="adresse" class="form-control"
 value="${etudiant.adresse}"/>
 </div>
 <div class="form-group">
 <label class="control-label">Email:</label>
 <input type="text" name="email" class="form-control"
 value="${etudiant.email}"/>
 </div>
 <div class="form-group">
 <label class="control-label">Année des études:</label>
 <input  min="2000" type="number" name="anneeEtudes" class="form-control"
 value="${etudiant.anneeEtudes}"/>
 </div>
 <div class="form-group">
 <label class="control-label">Départeemnt:</label>
 <input type="text" name="dep" class="form-control"
 value="${etudiant.dep}"/>
 </div>
<div>
<button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
</div>
</div>
</body>
</html>
