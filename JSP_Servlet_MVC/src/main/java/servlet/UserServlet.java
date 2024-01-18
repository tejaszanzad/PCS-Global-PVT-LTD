package servlet;

import java.io.IOException;
import java.util.List;

import DAO.UserDAO;
import bean.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		insertUser(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	 void insertUser(HttpServletRequest request, HttpServletResponse response) {
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String country = request.getParameter("country");
			
			User newUser = new User();
			newUser.setName(name);
			newUser.setEmail(email);
			newUser.setCountry(country);
			
			UserDAO.insertUser(newUser);	
			listUser(request, response);
		}
		 
		 void listUser(HttpServletRequest request, HttpServletResponse response) {
			 List<User> users = UserDAO.selectAllUsers();
			 
			 request.setAttribute("listUser", users);
			 
			 try {
				request.getRequestDispatcher("userList.jsp").forward(request, response);
			} 
			 
			 catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }


}

