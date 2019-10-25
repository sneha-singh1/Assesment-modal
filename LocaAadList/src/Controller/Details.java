package Controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.Detail;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import web.localad.modal.InfoUser;


/**
 * Servlet implementation class Details
 */
@WebServlet("/details.do")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MongoClient connection = ConnectionManager.getMongo();
	MongoDatabase db = ConnectionManager.getDb("Info");
	MongoCollection<Document> collection = db.getCollection("details");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Details() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Info");
		MongoCollection<Document> collection = db.getCollection("details");
		MongoCursor<Document> cursor = null;
		List<Detail> dataList = new LinkedList<>();

		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

		InfoUser data = new InfoUser(d.getString("name"), d.getString("email"), d.getString("phone"), d.getString("city"), d.getString("postalcode"),
					d.getString("description"), d.getString("postingtitle"));
			dataList.add((Detail) data);
		}
		request.setAttribute("list", dataList);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
