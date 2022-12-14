package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getPizzaServlet
 */
@WebServlet("/getPizzaServlet")
public class getPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String protein = request.getParameter("protein");
		String size = request.getParameter("size");
		

		Pizza pizza = new Pizza(Integer.parseInt(protein));
		
		PrintWriter writer = response.getWriter();
		writer.println("Your ordered a " + size + " inch " + protein + " pizza.");
		writer.close();
	}

}
