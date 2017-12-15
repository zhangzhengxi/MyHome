package com.zhangy;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/** 
* @ClassName: SkipPageOrEvalPage 
* @Description: TODO(π¶ƒ‹√Ë ˆ) 
* @author  shulb
*  
*/
public class SkipPageOrEvalPage extends TagSupport {
	
	@Override
	public int doEndTag() throws JspException {
		if("wavenet".equals(pageContext.getRequest().getParameter("name"))){
			return EVAL_PAGE;
		}else{
			return SKIP_PAGE;
		}
	}
}
