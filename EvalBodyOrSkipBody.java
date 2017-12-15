package com.zhangy;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/** 
* @ClassName: EvalBodyOrSkipBody 
* @Description: TODO(π¶ƒ‹√Ë ˆ:) 
* @author  shulb
*  
*/
public class EvalBodyOrSkipBody extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		if("wavenet".equals(pageContext.getRequest().getParameter("name"))){
			return EVAL_BODY_INCLUDE;
		}else{
			return SKIP_BODY;
		}
	}
}
