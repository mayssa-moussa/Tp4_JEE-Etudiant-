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
 Recherche des Etudiants
 </div>
 <div class="card-body">
 <form action="chercher.do" method="get">
 <label>Mot Clé</label>
 <input type="text" name="motCle" value="${model.motCle}" />
 <button type="submit" class="btn btn-primary">Chercher</button>
 </form>
 <table class="table table-striped">
 <tr>
<th>ID</th> <th>Nom</th> <th>Prénom</th> <th>date_naissance</th> <th>adresse</th> 
<th>email</th> <th>année_études</th> <th>departement</th><th colspan="2">Action</th>
 </tr>
 <c:forEach items="${model.etudiants}" var="e">
 <tr>
 <td>${e.idEtudiant}</td>
<td>${e.nom}</td>
<td>${e.prenom}</td>
<td>${e.dateNaiss}</td>
<td>${e.adresse}</td>
<td>${e.email}</td>
<td>${e.anneeEtudes}</td>
<td>${e.dep}</td>
<td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimer.do?id=${e.idEtudiant }">Supprimer</a></td>
 <td><a href="editer.do?id=${e.idEtudiant }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
 </div>
</div>
</div>
</body>
</html>