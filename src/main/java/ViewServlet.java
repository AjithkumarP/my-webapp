import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println();
       // out.println("<a href='index.jsp'>Add New Login User</a>");  
        out.println("<h1>Users List</h1>");  
          
        List<Registration123> list=RegistrationDao.getAllusers();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>User Name</th><th>Password</th><th>Event</th><th>Email</th><th>Phone No</th><th>Date</th><th>Location</th><th>Edit</th><th>Delete</th>");  
        for(Registration123 r1:list){  
         out.print("<tr><td>"+r1.getId()+"<td>"+r1.getFname()+"<td>"+r1.getLname()+"<td>"+r1.getUsername()+"<td>"+r1.getPassword()+"<td>"+r1.getEvent()+"<td>"+r1.getEmail()+"<td>"+r1.getPhno()+"<td>"+r1.getDate()+"<td>"+r1.getLocation()+"</td>"+"<td><a href='EditServlet?id="+r1.getId()+"'>edit</a></td><td><a href='DeleteServlet?id="+r1.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  