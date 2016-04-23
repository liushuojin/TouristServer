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
import entity.Spot;
import entity.SpotExample;
import entity.SpotFavorite;
import entity.SpotFavoriteExample;
import entity.Userinfo;
import entity.UserinfoExample;
import service.AdmininfoService;
import service.SpotFavoriteService;
import service.SpotService;
import service.UserinfoService;

@Controller
public class SpotFavoriteController {

	@Autowired
	private SpotFavoriteService spotFavoriteService;	

	@Autowired
	private UserinfoService userinfoService;	

	@Autowired
	private SpotService spotService;

	@RequestMapping("/spotFavorite")//查询某用户是否收藏了某景点
	public String favorite(HttpServletRequest request, HttpServletResponse response, String username, Integer spotid){
		//System.out.println("username:" + username + " " + "spotid:" + spotid);
		UserinfoExample userinfoExample = new UserinfoExample();
		userinfoExample.createCriteria().andNameEqualTo(username);
		List<Userinfo> list = userinfoService.selectByExample(userinfoExample);
		if(list != null && list.size() > 0){  	//有这个用户才能进行以下操作
			System.out.println("userId:" + list.get(0).getId());
			Integer userId = list.get(0).getId();
			List<SpotFavorite> listFavorites = null;
			try {
				SpotFavoriteExample example = new SpotFavoriteExample();
				example.createCriteria().andUserIdEqualTo(userId).andSpotIdEqualTo(spotid);
				listFavorites = spotFavoriteService.selectByExample(example);
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
				if (listFavorites != null && listFavorites.size() > 0) {
					printWriter.print("yes");
					System.out.println("yes");
					//System.out.println(list.get(0).getName());
					//request.getServletContext().setAttribute("user" + name, list.get(0).getId());
					//System.out.println(list.get(0).getId());
				} else {
					printWriter.print("no");
					System.out.println("no");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@RequestMapping("/cancelSpotFavorite")
	public String cancelFavorite(HttpServletRequest request, HttpServletResponse response){
		return null;
	}
/*
	@RequestMapping("/spot")
	public String adminLogin(HttpServletRequest request,
			HttpServletResponse response) {
		if (request.getSession().getAttribute("addMsg") != null)
			request.getSession().removeAttribute("addMsg");
		request.getSession().setAttribute("spots", spotService.getSpots());
		return "WEB-INF/spot_management";
	}

	@RequestMapping("/findSpot")
	public String findSpot(HttpServletRequest request,
			HttpServletResponse response, String name) {
		System.out.println("name:" + name);
		if (request.getSession().getAttribute("addMsg") != null)
			request.getSession().removeAttribute("addMsg");
		List<Spot> spots = spotService.findSpots(name);
		System.out.println("个数：" + spots.size());
		if (spots.size() == 0)
			System.out.println("靓仔，空值啊");//奇怪了，为什么这句不执行
		else
			request.getSession().setAttribute("spots", spots);
		return "WEB-INF/spot_management";
	}

	@RequestMapping("/addSpot")
	public String addSpot(HttpServletRequest request,
			HttpServletResponse response, String name, String pic,
			String trans, String intro) {
		System.out.println("name:" + name);
		System.out.println("trans:" + trans);
		System.out.println("intro:" + intro);

		if (spotService.addSpot(name, pic, trans, intro) > 0) {
			request.getSession().setAttribute("addMsg", "添加成功！");
		} else {
			request.getSession().setAttribute("addMsg", "添加失败！");
		}
		return "WEB-INF/spot_management";
	}

	@RequestMapping("/delSpot")
	public String delSpot(HttpServletRequest request, Integer id) {
		System.out.println(id);
		if (spotService.delSpot(id) > 0) {
			request.getSession().setAttribute("delMsg", "删除成功！");
		} else {
			request.getSession().setAttribute("delMsg", "删除失败！");
		}
		return "WEB-INF/spot_management";
	}

	@RequestMapping("/updateSpot")
	public String updateSpot(HttpServletRequest request,
			@RequestParam("spotId") int id, String name, String pic,
			String trans, String intro) {
		/*Enumeration<String> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(request.getParameterValues(string));

		}*//*
		System.out.println("intro" + intro);
		if (spotService.updateSpot(id, name, pic, trans, intro) > 0) {
			request.getSession().setAttribute("updateMsg", "更新成功！");
		} else {
			request.getSession().setAttribute("updateMsg", "更新失败！");
		}
		return "WEB-INF/spot_management";
	}
	
	//getAll
		@RequestMapping("/appGetSpots")
		public String appGetRoutes(HttpServletRequest request, HttpServletResponse response){
			System.out.println("appGetSpots");
			List<Spot> list;
			try {
				list = spotService.selectByExample(new SpotExample());
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
		*/
}
