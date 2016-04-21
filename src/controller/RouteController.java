package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Route;
import entity.RouteExample;
import entity.Userinfo;
import entity.UserinfoExample;
import service.AdmininfoService;
import service.RouteService;
import service.UserinfoService;

@Controller
public class RouteController {

	@Autowired
	private RouteService RouteService;

	@RequestMapping("/route")
	public String adminLogin(HttpServletRequest request,
			HttpServletResponse response) {
		if (request.getSession().getAttribute("addMsg") != null)
			request.getSession().removeAttribute("addMsg");
		request.getSession().setAttribute("Routes", RouteService.getRoutes());
		return "WEB-INF/Route_management";
	}

	@RequestMapping("/findRoute")
	public String findRoute(HttpServletRequest request,
			HttpServletResponse response, String name) {
		System.out.println("name:" + name);
		if (request.getSession().getAttribute("addMsg") != null)
			request.getSession().removeAttribute("addMsg");
		List<Route> Routes = RouteService.findRoutes(name);
		System.out.println("个数：" + Routes.size());
		if (Routes.size() == 0)
			System.out.println("靓仔，空值啊");//奇怪了，为什么这句不执行
		else
			request.getSession().setAttribute("Routes", Routes);
		return "WEB-INF/Route_management";
	}

	@RequestMapping("/addRoute")
	public String addRoute(HttpServletRequest request,
			HttpServletResponse response, String name, String intro) {
		System.out.println("name:" + name);
		System.out.println("intro:" + intro);

		if (RouteService.addRoute(name, intro) > 0) {
			request.getSession().setAttribute("addMsg", "添加成功！");
		} else {
			request.getSession().setAttribute("addMsg", "添加失败！");
		}
		return "WEB-INF/Route_management";
	}

	@RequestMapping("/delRoute")
	public String delRoute(HttpServletRequest request, Integer id) {
		System.out.println(id);
		if (RouteService.delRoute(id) > 0) {
			request.getSession().setAttribute("delMsg", "删除成功！");
		} else {
			request.getSession().setAttribute("delMsg", "删除失败！");
		}
		return "WEB-INF/Route_management";
	}

	@RequestMapping("/updateRoute")
	public String updateRoute(HttpServletRequest request,
			@RequestParam("RouteId") int id, String name, String intro) {
		/*Enumeration<String> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(request.getParameterValues(string));

		}*/
		System.out.println("intro" + intro);
		if (RouteService.updateRoute(id, name, intro) > 0) {
			request.getSession().setAttribute("updateMsg", "更新成功！");
		} else {
			request.getSession().setAttribute("updateMsg", "更新失败！");
		}
		return "WEB-INF/Route_management";
	}
	//getAll
	@RequestMapping("/appGetRoutes")
	public String appGetRoutes(HttpServletRequest request, HttpServletResponse response){
		List<Route> list;
		try {
			list = RouteService.selectByExample(new RouteExample());
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
				JSONArray jsonArray = JSONArray.fromObject(list);
				printWriter.print(jsonArray);
			} else {
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
