<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletReservation" method="get">
	  <input type="submit" value="Voir mes reservations"/>
	</form>
<div class="container">
	<table border="double">
	     <tr>
	       <th>id_client</th><th>nom</th><th>prenom</th><th>immatricule</th><th>modele</th><th>categorie</th><th>email</th><th>datelocation</th><th>dateretour</th><th>telephone</th><th>prix</th>
	     </tr>
	     <c:forEach items="${reserv.reserv}" var="r">
	         <tr>
	             <td>${r.id_client}</td>
	             <td>${r.nom}</td>
	             <td>${r.prenom}</td>
	             <td>${r.immatricule}</td>
	             <td>${r.modele}</td>
	             <td>${r.categorie}</td>
	             <td>${r.email}</td>
	             <td>${r.datelocation}</td>
	             <td>${r.dateretour}</td>
	             <td>${r.telephone}</td>             
	             <td>${r.prix}</td>
	            
	         </tr>
	     </c:forEach>
	</table>
</div>

 

</body>
</html>