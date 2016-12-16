package com.itwill.controller.annotation;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.view.AbstractView;

public class XMLView extends AbstractView{
	ResourceBundleMessageSource v;
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ArrayList<String> nameList=
				(ArrayList<String>)model.get("nameList");
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/xml;charset=UTF-8");
		out.println("<?xml version='1.0' encoding='UTF-8'?>");
		out.print("<friendList>");
		for (String nameStr : nameList) {
			out.println("<friend>"+nameStr+"</friend>");
		}
		out.print("</friendList>");
		
		
	}

	

}
