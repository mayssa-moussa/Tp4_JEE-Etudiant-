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
 Saisie des Etudiants
 </div>
 <div class="card-body">
 <form action="save.do" method="post">
 <div class="form-group">
 <label class="control-label">Nom:</label>
 <input type="text" name="nom" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prenom:</label>
 <input type="text" name="prenom" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Date de naissance:</label>
 <input type="date" name="dateNaiss" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Adresse:</label>
 <input type="text" name="adresse" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Email:</label>
 <input type="text" name="email" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Année des études:</label>
 <input  min="2000" type="number" name="annee-etudes" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Départeemnt:</label>
 <input type="text" name="dep" class="form-control"/>
 </div>
 <div>
 <button type="submit" class="btn btn-primary">Ajouter</button>
 </div>
 </form>

 </div>
</div>
</div>
</body>
</html>