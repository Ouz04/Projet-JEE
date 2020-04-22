<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 


     <title>Location voiture</title>
</head>
<body>
<h2>Effectuer une reservation</h2>

 

<form action="ServletReservation" method="post" class="form-inline">
    
   
      
    <div class="form-group">
       <input type="text" class="form-control mb-2 mr-sm-2" placeholder="immatricule" name="immatricule"/>
    </div><br><br><br>
    
     
 <div>
     <input type="submit" value="Valider"/> 
     
</div>
 </form>  
		<div>
<table border="double">
     <tr">
       <th>immatricule</th><th>modele</th><th>categorie</th><th>nbreplace</th><th>prix</th>
     </tr>
     <c:forEach items="${mode.vehicules}" var="v">
	     <tr>
		     <td>${v.immatricule}</td>
		     <td>${v.modele}</td>
		     <td>${v.categorie}</td>
		     <td>${v.nbreplace}</td>		     
		     <td>${v.prix}</td>
		     <td><a href="client.jsp">Reserver</a></td>
	     </tr>
     </c:forEach>
</table>
</div>
</body>
</html>