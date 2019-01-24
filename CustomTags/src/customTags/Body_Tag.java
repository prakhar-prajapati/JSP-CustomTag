package customTags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class Body_Tag extends BodyTagSupport {

	int count=0;
	 public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		try {
          BodyContent bd=getBodyContent();
          String bodydata=bd.getString();
          JspWriter out=bodyContent.getEnclosingWriter();
  	      for(int i=0;i<count ;i++)
  	      {
  	    	  out.println(bodydata);
  	      }
			
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return SKIP_BODY;
	}

}
