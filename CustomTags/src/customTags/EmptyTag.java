package customTags;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class EmptyTag extends SimpleTagSupport 
{

	@Override
	public void doTag() throws JspException, IOException {
		int count=0;
	JspWriter out=getJspContext().getOut();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zappyfood_db", "root", "root");
		 PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM cart");
			
		ResultSet rs = ps.executeQuery();
	     if(rs.next())
	     {
	    	 count=rs.getInt("COUNT(*)");
	    	 out.println(count);
	     }
	     
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
			 
	 }
	
	}


