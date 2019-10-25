package Controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web.localad.modal.Option;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet("/init.do")
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<Option> questions = new ArrayList<>();
		questions.add(new Option(1, "", "Job-Offered", "gig-offered", "resume/job-wanted", "housing-offered","housing-wanted","for sale by owner","for sale by dealer","wanted by owner","wanted by dealer","service offered","community","event/class", 'a', 0));
		

		request.getSession().setAttribute("questions", questions);
		
		request.getSession().setAttribute("startIndex", 0);
		request.getSession().setAttribute("endIndex", questions.size() - 1);
		
		request.getRequestDispatcher("option.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
