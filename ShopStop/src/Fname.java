import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Fname
 */
@WebServlet("/Fname")
public class Fname extends HttpServlet {
	private static final long serialVersionUID = 1L;
           /**
     * @see HttpServlet#HttpServlet()
     */
    public Fname() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("Text/Html");
		PrintWriter out = response.getWriter();
		
		String FirstName=request.getParameter("First");
		String LastName=request.getParameter("last");
		
		out.println("Your FirstName is: " +FirstName+"\n");
		out.println("\nYour LastName is: " +LastName+"\n");
		out.flush();
		
	}
}