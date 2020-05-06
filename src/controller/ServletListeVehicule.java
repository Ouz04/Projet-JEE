package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Catalogue;
import model.CatalogueVehicule;
import model.Vehicule;

/**
 * Servlet implementation class ServletListeVehicule
 */
@WebServlet("/ServletListeVehicule")
public class ServletListeVehicule extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Catalogue metier;

	public void init() throws ServletException {
		metier = new CatalogueVehicule();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListeVehicule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out= response.getWriter();
	        VehiculeModele voiture=new VehiculeModele();
	        CatalogueVehicule cat = new CatalogueVehicule();
	        //List<Reservation> reservations=catalogue.listReservations();
	       // HttpSession session = request.getSession();
	       // int idClient =(int) session.getAttribute("idClient");
	      //  System.out.println("je suis lid du client "+idClient);
	        List<Vehicule> vehicules = cat.listVehicules();        
	        voiture.setVehicules(vehicules);
	        request.setAttribute("vehicules", voiture);
		request.getRequestDispatcher("/Administrateur/listevehicule.jsp").
	    forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Administrateur/listevehicule.jsp").
	    forward(request,response);
	}

}
