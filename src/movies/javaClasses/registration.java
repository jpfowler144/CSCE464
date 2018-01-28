package movies.javaClasses;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registration
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Users user = new Users();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		//TODO Check if user already exists
		if(user.userExists(userName)){
			//TODO Send message
			response.sendRedirect("registration.jsp?message=" + URLEncoder.encode("User already registerd", "UTF-8"));
		}
		
		//TODO Submit user and password to properties file
		if (user.register(userName, password)) {
			response.sendRedirect("login.jsp");
		}
		
		else {
			response.sendError(1, "Unable to register User");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
