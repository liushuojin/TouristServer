package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Userinfo;
import entity.UserinfoExample;
import service.AdmininfoService;
import service.UserinfoService;

@Controller
public class UserinfoController {
	//½ûÑÔ
	@Autowired
	private UserinfoService userinfoService;

	@RequestMapping("/getUserinfos")
	public String adminLogin(HttpServletRequest request,
			HttpServletResponse response, String name, String password) {
		System.out.println("userinfoController");
		request.getSession().setAttribute("userinfos",
				userinfoService.getUserinfos());
		return "WEB-INF/user_management";
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request,
			HttpServletResponse response, String name, String password){
		System.out.println("h");
		int result;
		try {
			result = userinfoService.insert(new Userinfo(name, password));
		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
		}
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		PrintWriter printWriter;
		try {
			printWriter = response.getWriter();
			if (result > 0) {
				printWriter.print("yes");
			} else {
				printWriter.print("no");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request,
			HttpServletResponse response, String name, String password){
		System.out.println("h");
		List<Userinfo> list;
		try {
			UserinfoExample example = new UserinfoExample();
			example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
			list = userinfoService.selectByExample(example);
		} catch (Exception e) {
			list = null;
			e.printStackTrace();
		}
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		PrintWriter printWriter;
		try {
			printWriter = response.getWriter();
			if (list != null && list.size() > 0) {
				printWriter.println("yes");
			} else {
				printWriter.println("no");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping("/clientLogin")
	public String clientLogin(HttpServletRequest request,
			HttpServletResponse response, String name, String password){
		System.out.println("n:" + name);
		System.out.println("p:" + password);
		List<Userinfo> list;
		try {
			UserinfoExample example = new UserinfoExample();
			example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
			list = userinfoService.selectByExample(example);
			System.out.println(list.size());
		} catch (Exception e) {
			list = null;
			e.printStackTrace();
		}
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		PrintWriter printWriter;
		try {
			printWriter = response.getWriter();
			if (list != null && list.size() > 0) {
				printWriter.print("yes");
				System.out.println("yes");
				System.out.println(list.get(0).getName());
				request.getServletContext().setAttribute("user" + name, list.get(0).getId());
				System.out.println(list.get(0).getId());
			} else {
				printWriter.println("no");
				System.out.println("no");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
