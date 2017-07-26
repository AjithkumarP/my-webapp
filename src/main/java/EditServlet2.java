import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet2")  
public class EditServlet2 extends HttpServlet {  
    protected void doPost(HttpServletRequest req, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String id=req.getParameter("id");  
        
  String user_name=req.getParameter("uname");
   String pass_word=req.getParameter("password");
   String f_name=req.getParameter("fname");
   String l_name=req.getParameter("lname");
   String ph_no=req.getParameter("phno");
   String emailid=req.getParameter("email");
   String date=req.getParameter("date");
   String location=req.getParameter("location");
   String event_info=req.getParameter("event"); 

          
        Registration123 r=new Registration123();  
     r.setId(id);
     r.setFname(f_name);
     r.setLname(l_name);
     r.setUsername(user_name);
     r.setPassword(pass_word);
     r.setEvent(event_info);
     r.setEmail(emailid);
     r.setPhno(ph_no);
     r.setDate(date);
     r.setLocation(location);
          
        int status=RegistrationDao.update(r);  
        if(status>0){  
            response.sendRedirect("index.jsp");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  