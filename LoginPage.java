package com.zhangy;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class LoginPage extends TagSupport {
	
	/**
	 * 登录主图地址
	 * 0为默认图片
	 */
	private  String pic_url="0";
	

	public String getPic_url() {
		return pic_url;
	}


	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}


	@Override
	public int doStartTag() throws JspException {
		try {
//			JspWriter out=pageContext.popBody();
			String html="	<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">"
									+"<tr><td align=\"center\" valign=\"middle\"  class=\"bgcolor\" ><table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">"
									+"<tr><td valign=\"top\" align=\"center\" style=\"padding-bottom:10px;\"><img id=title src=\"/image/login-title2.png\"  style=\"margin-top: 80px\"></td></tr>"
									+"<tr><td  valign=\"middle\"><img id=\"pic\" alt=\"登录页面\" src=\"/image/mainpic/"+getPic_url()+".jpg\"  width=\"700\" height=\"300\"  style=\"border-radius:20px 20px 0px 0px\" >"
									+"</td></tr><tr><td height=\"38\" width=\"690\" >"
									+ "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"font-size:14px; font-weight:bold\"  align=\"center\"><tr>"
									+"<td width=\"23\" align=\"left\"><img id=\"foot1\"  src=\"/image/foot-1.png\"></td>"
									+"<td  name=\"foot2\"  background=\"/image/foot-2.png\">用户名:</td>"
									+"<td  name=\"foot2\"  background=\"/image/foot-2.png\"><input type=\"text\" id=\"empid\" name=\"empid\" onkeypress=\"subUser(event)\" value=\"\" valuebak=\"tbasq@tba.gov.cn\" class=\"input1\"></td>"
									+"<td  name=\"foot2\"  background=\"/image/foot-2.png\">密码:</td>"
									+"<td  name=\"foot2\"  background=\"/image/foot-2.png\"><input  type=\"password\" id=\"emppwd\"  name=\"emppwd\"  onkeypress=\"subUser(event)\" value=\"\" class=\"input1\">"
									+"<input  type=\"hidden\" id=\"ieversion\"  name=\"ieversion\"  ></td>"
									+"<td  name=\"foot2\"  background=\"/image/foot-2.png\"><img id=\"loginButton\" src=\"/image/dl.png\" style=\"cursor:hand;\" onClick=\"login();\" border=\"0\"></td>"
									+"<td  name=\"foot2\"  background=\"/image/foot-2.png\"><img id=\"apllyBotton\" src=\"/image/sh.png\" style=\"cursor:hand;\" onClick=\"shenqing();\" border=\"0\"></td>"
									+"<td  align=\"right\" width=\"23\"><img id=\"foot3\" src=\"/image/foot-3.png\"></td>"
									+"</tr></table></td></tr><tr><td class=\"font1\">版权所有：太湖流域管理局水文局（信息中心）   技术支持：网波软件</td></tr>"
									+"<tr><td class=\"font1\">建议使用IE8及以上的浏览器访问。<a href=\"http://windows.microsoft.com/zh-CN/internet-explorer/downloads/ie-9/worldwide-languages\" target=\"_blank\">最新下载</a>"
									+"</td></tr></table></td></tr></table>";
			//out.print(html);
			pageContext.getOut().println(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
