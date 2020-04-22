<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<table border="double">
     <tr>
       <th>id_client</th><th>nom</th><th>immatricule</th>><th>modele</th><th>categorie</th><th>nbreplace</th><th>prix</th>
     </tr>
     <c:forEach items="${mode.listReservations}" var="v">
	     <tr>
		     <td>${v.id_client}</td>
		     <td>${v.nom}</td>
		     <td>${v.immatricule}</td>
		     <td>${v.modele}</td>
		     <td>${v.categorie}</td>
		     <td>${v.nbreplace}</td>		     
		     <td>${v.prix}</td>
		    
	     </tr>
     </c:forEach>
</table>
</div>

</body>
</html>