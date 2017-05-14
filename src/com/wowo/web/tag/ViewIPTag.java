package com.wowo.web.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
//��дһ��ʵ��tag�ӿڵı�ǩ��������
public class ViewIPTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		HttpServletRequest request = (HttpServletRequest) this.pageContext.getRequest();
		String ip = request.getRemoteAddr();
		try {
			JspWriter out = this.pageContext.getOut();
			out.write(ip);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return 0;
	}

}
