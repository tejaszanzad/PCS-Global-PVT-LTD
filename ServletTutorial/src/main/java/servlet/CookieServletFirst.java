package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServletFirst
 */
@WebServlet("/CookieServletFirst")
public class CookieServletFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServletFirst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(password.equals("1234") && username.equals("Tejas")) {
			Cookie ck = new Cookie("uname", username);
			ck.setMaxAge(15);
			response.addCookie(ck);
			response.sendRedirect("CookieServletSecond");
			
		}
		
		else {
			pw.println("Usrname and password donot match");
			RequestDispatcher rd = request.getRequestDispatcher("/cookieLogin.html");
			rd.include(request, response);
			
		}
		
		
		// pw.println("<form action = 'CookieServletSecond'>");
		//pw.println("<input type='submit' value='go'>"); 
		// pw.println("</form>");
		 
		

	}

}
