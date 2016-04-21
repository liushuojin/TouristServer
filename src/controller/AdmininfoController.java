package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.AdmininfoService;

@Controller
public class AdmininfoController {
	
	@Autowired
	private AdmininfoService admininfoService;
	
	@RequestMapping("/adminlogin")
	public String adminLogin(HttpServletRequest request, HttpServletResponse response, String name, String password){
		if(admininfoService.isAdmin(name, password)){
			request.getSession().setAttribute("admin", name);
			return "WEB-INF/admin";
		}
		else {
			return "index";
		}
	}
	
}
