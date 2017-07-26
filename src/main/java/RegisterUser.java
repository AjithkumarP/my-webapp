
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet{
    RegisterUser javaEmail=null;
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
 {
    res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   String user_name=req.getParameter("username");
   String pass_word=req.getParameter("password");
   String f_name=req.getParameter("fname");
   String l_name=req.getParameter("lname");
   String ph_no=req.getParameter("phno");
   String emailid=req.getParameter("email");
   String date=req.getParameter("date");
   String location=req.getParameter("location");
   String event_info=req.getParameter("event");
    
    Registration123 r=new Registration123();
     r.setFname(f_name);
     r.setLname(l_name);
     r.setUsername(user_name);
     r.setPassword(pass_word);
     r.setEvent(event_info);
     r.setEmail(emailid);
     r.setPhno(ph_no);
     r.setDate(date);
     r.setLocation(location);

    int status=RegistrationDao.insert(r);
    
             if(status>0){  
            out.print("<p align=\"center\">Record saved successfully!</p>");  
            req.getRequestDispatcher("Login.jsp").include(req, res);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
        res.setContentType("text/html;charset=UTF-8");

String toMail = req.getParameter("email");


try {
RegisterUser javaEmail = new RegisterUser();
final String username = "sathyamoorthy.ravichandran@kggroup.com";
final String password = "sathya@1234";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("sathyamoorthy.ravichandran@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(toMail));

message.setSubject("Event Registration Succesful");
message.setContent("<h1>Hi "+f_name+"</h1><br><br><h2>Your Registration Is Succesful</h2><br><br><h3>Event Details:<br><br>Date:"+date+"<br>"+"<br>Location:"+location+"<br>","text/html" );
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e2)
{
throw new RuntimeException(e2);
}

//javaEmail.sendEmail(toMail);
out.println("Process Completed\n");
} catch (Exception e1) {
e1.printStackTrace();
}
out.println("event registered successfully");
}
    /* List<Registration123>list=RegistrationDao.getAllusers();
     out.println("<html><style>body{background-image:url('http://images.all-free-download.com/images/graphiclarge/hd_sky_picture_02_hd_pictures_166301.jpg');}</style><body><table border='1'>");
         out.println("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>User Name</th><th>Password</th><th>Event</th><th>Email</th><th>Phone No</th><th>Date</th><th>Location</th></tr>");
     for(Registration123 r1:list)
     {
         out.println("<tr><td>"+r1.getId()+"<td>"+r1.getFname()+"<td>"+r1.getLname()+"<td>"+r1.getUsername()+"<td>"+r1.getPassword()+"<td>"+r1.getEvent()+"<td>"+r1.getEmail()+"<td>"+r1.getPhno()+"<td>"+r1.getDate()+"<td>"+r1.getLocation()+"</td></tr>");
     }
     out.println("</table></body></html>");*/
     }
 
