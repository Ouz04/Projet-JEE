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
    <div align="center">
       <h2>Gestion des Vehicules</h2>
    
            <form action="ServletGestionVehicule" method="post" class="form-inline">
              
                <table>
                    <tr>
                        <td align="right">
                             <label for="pseudo">Immatricule :</label><br>
                          </td>
                        <td>
                            <input type="text" class="form-control" placeholder="immatricule " name="immatricule"/>
                        </td>
                    </tr>
                    
                   <tr>
                          <td align="right">
                             <label for="pseudo">Modele :</label><br>
                          </td>
                          <td>
                             <input type="text" class="form-control" placeholder="modele"  name="modele" />
                          </td>
                  </tr>
                  
                   <tr>
                          <td align="right">
                             <label for="pseudo">Categorie :</label><br>
                          </td>
                          <td>
                             <input type="text" class="form-control" placeholder="categorie" name="categorie"  />
                          </td>
                   </tr>
                   
                   <tr>
                          <td align="right">
                             <label for="number">nombre de place :</label>
                          </td>
                          <td>
        
                             <input type="number" class="form-control" placeholder="nombre de place" name="nbreplace"  />
                           </td>
                   </tr>
                   
                   <tr>
                          <td align="right">
                             <label for="number">prix :</label>
                          </td>
                          <td>
                             <input type="number" class="form-control" placeholder="prix"  name="prix" />
                          </td>
                   </tr>
                   <tr>
                          <td></td>
                          <td align="center">
                             <br />
                             <!-- <a href="listereservation.jsp"> <input type=button  value="Valider ma reservation"/></a>  -->
                              <input type="submit" value="Ajouter un vehicule">
                          </td>
                     </tr>
            </table>    
                </div>
            </form>
            <br>
               
            <div class="container">
                        <table border="double">
                             <tr align="right">
                               <th>immatricule</th><th>modele</th><th>categorie</th><th>nbreplace</th><th>prix</th>
                             </tr>
                             <c:forEach items="${mode.vehicules}" var="v">
                                 <tr>
                                     <td>${v.immatricule}</td>
                                     <td>${v.modele}</td>
                                     <td>${v.categorie}</td>
                                     <td>${v.nbreplace}</td>             
                                     <td>${v.prix}</td>
                                     <td><a href="client.jsp?motCle=${v.immatricule}">Ajouter</a></td>
                                 </tr>
                             </c:forEach>
                        </table>
            </div>
    </div>                         
</body>
</html>