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
 Confirmation Ajout Etudiant
 </div>
 <div class="card-body">

 <div class="form-group">
 <label class="control-label">ID :</label>
 <input type="text" name="nom" class="form-control"
value="${etudiant.idEtudiant }"/>

 <label class="control-label">Nom:</label>
 <input type="text" name="nom" class="form-control"
value="${etudiant.nom}"/>
 </div>
<div class="control-label">
 <label class="control-label">Prenom :</label>
 <input type="text" name="prenom" class="form-control"
value="${etudiant.prenom }"/>
 </div>
 <div class="control-label">
 <label class="control-label">Date de naissance :</label>
 <input type="date" name="dateNaiss" class="form-control"
value="${etudiant.dateNaiss }"/>
 </div>
 <div class="control-label">
 <label class="control-label">Adresse :</label>
 <input type="text" name="adresse" class="form-control"
value="${etudiant.adresse }"/>
 </div>
 <div class="control-label">
 <label class="control-label">Email :</label>
 <input type="text" name="email" class="form-control"
value="${etudiant.email }"/>
 </div>
 <div class="control-label">
 <label class="control-label">Année des études :</label>
 <input type="text" name="annee_etudes" class="form-control"
value="${etudiant.anneeEtudes }"/>
 </div>
  <div class="control-label">
 <label class="control-label">Département :</label>
 <input type="text" name="dep" class="form-control"
value="${etudiant.dep }"/>
 </div>
 </div>

 </div>
</div>
</body>
</html>