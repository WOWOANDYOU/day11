package com.wowo.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo4 extends TagSupport {
	public String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().write(name);
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException("IO Exception"+e.getMessage());
		}
		return Tag.EVAL_BODY_INCLUDE;
	}

}
