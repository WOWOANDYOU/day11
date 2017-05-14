package com.wowo.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo1 extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		return Tag.EVAL_BODY_INCLUDE;  //doStartTag方法返回  eval_body_include 常量 表明执行表前提内的东西
	}

}
