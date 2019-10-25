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
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		MongoCursor<Document> cursor ;
		cursor = collection.find().iterator();
		
		List<InfoUser> dataList = new LinkedList<>();

		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

		InfoUser data = new InfoUser(d.getString("name"),d.getInteger("id"), d.getString("email"), d.getString("phone"), d.getString("city"), d.getString("postalcode"),
					d.getString("description"), d.getString("postingtitle"));
			dataList.add( data);
		}
		request.setAttribute("list", dataList);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int c = 0;
		int c1 = 0;
		int id, idi = 0;
		MongoCursor<Document> cursor = collection.find().iterator();
		while (cursor.hasNext()) {
			Document doc = (Document) cursor.next();
			idi = doc.getInteger("Advertisement id");
			c++;
		}
		if (c != 0) {
			id = idi;
		} else {
			id = 100;
		}
		String tit = request.getParameter("name");
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
		int postal = Integer.parseInt(request.getParameter("postalcode"));
		String desc = request.getParameter("description");
		String email = request.getParameter("email");
		Document document = new Document("Advertisement ID", id + 1).append("name", tit).append("city", city)
				.append("phone", phone).append("postalcode", postal).append("description", desc).append("email", email);
		collection.insertOne(document);
		c1++;
		request.setAttribute("counter", c1);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		ConnectionManager.close();
	}

}
