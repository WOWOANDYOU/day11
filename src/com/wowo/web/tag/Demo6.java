package com.wowo.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo6 extends TagSupport {
	public int num=0;

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int doAfterBody() throws JspException {
		num--;
		if(num>0){
			return IterationTag.EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}

	@Override
	public int doStartTag() throws JspException {
		return Tag.EVAL_BODY_INCLUDE;
	}
	
}
