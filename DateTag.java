package com.zhangy;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
/**
 * 
* @ClassName: DateTag 
* @Description: TODO(功能描述:实现一个显示当前年月日的自定义标签) 
* @author  shulb
*
 */
public class DateTag extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String  dateStr=simpleDateFormat.format(new Date());
		try {
			pageContext.getOut().print(dateStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  super.doStartTag();
	}
}
