import javax.net.ssl.ExtendedSSLSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
    
    static String u1,p1;
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
    {
        PrintWriter out=response.getWriter();
        try{
        String username1=request.getParameter("uname");
        String password1=request.getParameter("psword");
        Connection conn=RegistrationDao.getConnection();
       // PreparedStatement ps=conn.prepareStatement("select * from reg ");
        Statement st=conn.createStatement();
      //  ps.setString(1,username1);
       // ps.setString(2,password1);
       
        ResultSet rs=st.executeQuery("select username,password from reg where username='"+username1+"' and password='"+password1+"'");
        while(rs.next())
        {
           
            u1=rs.getString(1);
            p1=rs.getString(2);
        }
       
            if(username1.equals(u1)&&password1.equals(p1))
            {
            HttpSession httpSession=request.getSession();
            httpSession.setAttribute("sessionname",username1);
         // out.println(" welcome "+username1);
         response.sendRedirect("Welcome");}
        
        else 
        {
            out.println(" <h1>invalid user so please register<h1>");
        }
        }catch(Exception e){e.printStackTrace();}
    }
}