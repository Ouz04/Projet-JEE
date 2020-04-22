package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NewLocation;
import dao.NewReservation;

/**
 * Servlet implementation class ContReservation
 */
public class ServletReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servet reseration</title>");
            out.println("</head>");
           
            out.println("<body>");
            out.println("nom:"+request.getParameter("nom"));
            out.println("<br>");
            out.println("prenom:"+request.getParameter("prenom"));
            out.println("<br>");
            out.println("telephone:"+request.getParameter("tel"));
            out.println("<br>");
            out.println("debut location:"+request.getParameter("datelocation"));
            out.println("<br>");
            out.println("fin location:"+request.getParameter("dateretour"));
            out.println("<br>");
            out.println("ville location:"+request.getParameter("villelocation"));
            out.println("<br>");
            out.println("Modele:"+request.getParameter("categorie"));
            out.println("</body>");
            out.println("</html>");
       
           
        }
        finally {
            out.close();
        }
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		this.getServletContext().getRequestDispatcher("/reserver.jsp").forward(request, response);
	}

}
