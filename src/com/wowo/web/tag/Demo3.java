package com.wowo.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo3 extends TagSupport {
	public boolean out;
	
	public void setOut(boolean out) {
		this.out = out;
	}

	@Override
	public int doStartTag() throws JspException {
		if(out){
			return Tag.EVAL_BODY_INCLUDE;
		}else{
			return Tag.SKIP_BODY;
		}
	}

}
