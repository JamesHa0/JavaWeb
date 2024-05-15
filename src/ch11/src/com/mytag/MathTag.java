package com.mytag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MathTag extends SimpleTagSupport {
	double x;

	public void setX(String x) {
		double num = 0;
		try {
			num = Double.parseDouble(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.x = num;
	}

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.print(x + "的平方根是" + Math.sqrt(x));
	}

}
