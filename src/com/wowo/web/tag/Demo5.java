package com.wowo.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo5 extends TagSupport {
	public int num=5;//控制标签体内容 循环输出的次数

	@Override
	public int doStartTag() throws JspException {
		return Tag.EVAL_BODY_INCLUDE;
	}
	@Override
	public int doAfterBody() throws JspException {
		num--;
		if(num>0){
			return IterationTag.EVAL_BODY_AGAIN;
		}
		return Tag.SKIP_BODY;
	}

}
