package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JNDIDataSourceController {

	@RequestMapping("/jndi_datasource")
	public String jndiDatasource(){
		return "jndi_datasource";
	}
}
