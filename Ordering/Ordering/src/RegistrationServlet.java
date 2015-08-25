import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		PrintWriter out = response.getWriter();  
		Gson gson = new Gson();
		
		String fname = request.getParameter("firstname");  
		String lname = request.getParameter("lastname");  
		String bstreet = request.getParameter("bstreet");
		String bzip = request.getParameter("bzip");
		String bcity = request.getParameter("bcity");		
		String bstate = request.getParameter("bstate");
		String bcountry = request.getParameter("bcountry");
		String cstreet = request.getParameter("cstreet");
		String czip = request.getParameter("czip");
		String ccity = request.getParameter("ccity");		
		String cstate = request.getParameter("cstate");
		String ccountry = request.getParameter("ccountry");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("contact");
		Address billingAddr = new Address(bstreet,bzip,bcity,bstate,bcountry);
		Address connAddr = new Address(cstreet,czip,ccity,cstate,ccountry);
		Customer new_cust = new Customer("new","", fname, lname, billingAddr, connAddr, email, dob, contact);
		
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(new_cust);

		/*try {
			//write converted json data to a file named "file.txt"
			 
			FileWriter writer = new FileWriter("c:\\file.txt");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/* SOAP Client */
		//Test objTest = new Test();	
		
		System.out.println(json);
		RESTClient client = new RESTClient();
		out.print("Inserting data...\n");
		client.insert1(json);		
		out.print("You are successfully registered...");		
	}		
}