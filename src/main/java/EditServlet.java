import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Registration123 user</h1>");  
        String id=request.getParameter("id");  
        //int id=Integer.parseInt(sid);  
          
        Registration123 l=RegistrationDao.getUserById(id);
        //  response.sendRedirect("index.jsp");
       out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+l.getId()+"'/></td></tr>");  
        out.print("<tr><td>FirstName:</td><td><input type='text' name='fname' value='"+l.getFname()+"'/></td></tr>"); 
        out.print("<tr><td>LastName:</td><td><input type='text' name='lname' value='"+l.getLname()+"'/></td></tr>"); 
       out.print("<tr><td>UserName:</td><td><input type='text' name='uname' value='"+l.getUsername()+"'/></td></tr>");
        out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+l.getPassword()+"'/></td></tr>");  
        out.print("<tr><td>Event:</td><td><input type='checkbox' name='event' value='"+l.getEvent()+"'>Football<input type='checkbox' name='event' value='Cricket'>Cricket<input type='checkbox' name='event' value='Tennis'>Tennis");
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+l.getEmail()+"'/></td></tr>");  
        out.print("<tr><td>Phno:</td><td><input type='text' name='phno' value='"+l.getPhno()+"'/></td></tr>");
        out.print("<tr><td>Date:</td><td><input type='date' name='date' value='"+l.getDate()+"'/></td></tr>");
        out.print("<tr><td>LastName:</td><td><input type='text' name='location' value='"+l.getLocation()+"'/></td></tr>"); 
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}  