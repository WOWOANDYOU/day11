package com.wowo.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo2 extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		return Tag.SKIP_BODY;  //标签体 不执行 跳过
	}
	
}
