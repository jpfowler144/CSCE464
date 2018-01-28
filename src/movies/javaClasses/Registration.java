package movies.javaClasses;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Users user = new Users();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.println(userName);
		
		//TODO Check if user already exists
		//if(user.checkExistence().equals(true)){
			//TODO Send message
		//	response.sendRedirect("registration.jsp?message=" + URLEncoder.encode("User already registerd", "UTF-8"));
	//	}
		
	//	else {
	//		user.setToProperties();
	//		response.sendRedirect("Login.jsp");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
