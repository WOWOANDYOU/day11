package com.wowo.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo1 extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		return Tag.EVAL_BODY_INCLUDE;  //doStartTag��������  eval_body_include ���� ����ִ�б�ǰ���ڵĶ���
	}

}
