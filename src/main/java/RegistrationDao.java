import java.util.*;
import java.io.PrintWriter;
import java.sql.*;

public class RegistrationDao
{
    public static Connection conn=null;

    public static Connection getConnection()
    {
       try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");
    }catch(Exception e){
        e.printStackTrace();
    }
    return conn;
}
public static int update(Registration123 l){  
        int status=0;  
        try{  
            Connection con=RegistrationDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update reg set fname=?,lname=?,username=?,password=?,event=?,email=?,phno=?,date=?,location=? where id=?");  
                       
            ps.setString(1,l.getFname());  
            ps.setString(2,l.getLname());
            ps.setString(3,l.getUsername());  
            ps.setString(4,l.getPassword()); 
            ps.setString(5,l.getEvent());  
            ps.setString(6,l.getEmail()); 
            ps.setString(7,l.getPhno());
            ps.setString(8,l.getDate());
            ps.setString(9,l.getLocation());    

            ps.setString(10,l.getId()); 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int insert(Registration123 r)
    {
     int status=0;
     try{
         
         Connection conn=RegistrationDao.getConnection();
          PreparedStatement pr=conn.prepareStatement("insert into reg(fname,lname,username,password,event,email,phno,date,location) values(?,?,?,?,?,?,?,?,?)");
    pr.setString(1,r.getFname());
     pr.setString(2,r.getLname());
     pr.setString(3,r.getUsername());
     pr.setString(4,r.getPassword());
     pr.setString(5,r.getEvent());
     pr.setString(6,r.getEmail());
    pr.setString(7,r.getPhno());
     pr.setString(8,r.getDate());
     pr.setString(9, r.getLocation());
     status=pr.executeUpdate();
     }catch(SQLException e){
         e.printStackTrace();
        System.out.println(e);
     }
     return status;
    }

    public static List<Registration123> getAllusers()
    {
        List<Registration123>list=new ArrayList<Registration123>();
        try{
            Connection conn = RegistrationDao.getConnection();
            PreparedStatement pr=conn.prepareStatement("select * from reg");
            ResultSet rs=pr.executeQuery();
             while(rs.next()){  
                Registration123 r=new Registration123(); 
                r.setId(rs.getString(1));
                 r.setFname(rs.getString(2));
                r.setLname(rs.getString(3));  
                r.setUsername(rs.getString(4));
                r.setPassword(rs.getString(5));  
                r.setEvent(rs.getString(6));
                r.setEmail(rs.getString(7));
                r.setPhno(rs.getString(8));
                r.setDate(rs.getString(9));
                r.setLocation(rs.getString(10));
        
 
                list.add(r);  
            }
            
        }catch(Exception e){e.printStackTrace();} return list;
    }
    public static Registration123 getUserById(String id){  
        Registration123 l=new Registration123();  
          
        try{  
            Connection con=RegistrationDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from reg where id=?");  
            ps.setString(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                l.setId(rs.getString(1));
                 l.setFname(rs.getString(2));
                l.setLname(rs.getString(3));  
                l.setUsername(rs.getString(4));
                l.setPassword(rs.getString(5));  
                l.setEvent(rs.getString(6));
                l.setEmail(rs.getString(7));
                l.setPhno(rs.getString(8));
                l.setDate(rs.getString(9));
                l.setLocation(rs.getString(10));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return l;  
    } 
        public static int delete(String id){  
        int status=0;  
        try{  
            Connection con=RegistrationDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from reg where id=?");  
            ps.setString(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }
    public static int login(String name,String pass)throws Exception
    {
        System.out.println("entered login dao");
        int userres=0;
        conn=RegistrationDao.getConnection();
        Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select username,password from reg where username='name'");
        //Statement st=conn.createStatement();
       // userres=pr.executeUpdate();
       
      String u1=rs.getString(1);
            String p1=rs.getString(2);
            if(name.equals(u1) && pass.equals(p1))
    {
        userres=1;
       return userres;
    }  
    else{
        return userres;
    }

    }
}