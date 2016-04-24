package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.RouteFavorite;
import entity.RouteFavoriteExample;
import entity.Userinfo;
import entity.UserinfoExample;
import service.RouteFavoriteService;
import service.RouteService;
import service.UserinfoService;

@Controller
public class RouteFavoriteController {

	@Autowired
	private RouteFavoriteService RouteFavoriteService;	

	@Autowired
	private UserinfoService userinfoService;	

	@Autowired
	private RouteService routeService;

	@RequestMapping("/routeFavorite")//查询某用户是否收藏了某景点
	public String favorite(HttpServletRequest request, HttpServletResponse response, String username, Integer routeid){
		//System.out.println("username:" + username + " " + "spotid:" + spotid);
		UserinfoExample userinfoExample = new UserinfoExample();
		userinfoExample.createCriteria().andNameEqualTo(username);
		List<Userinfo> list = userinfoService.selectByExample(userinfoExample);
		if(list != null && list.size() > 0){  	//有这个用户才能进行以下操作
			System.out.println("userId:" + list.get(0).getId());
			Integer userId = list.get(0).getId();
			List<RouteFavorite> listFavorites = null;
			try {
				RouteFavoriteExample example = new RouteFavoriteExample();
				example.createCriteria().andUserIdEqualTo(userId).andRouteIdEqualTo(routeid);
				listFavorites = RouteFavoriteService.selectByExample(example);
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
	

	@RequestMapping("/routeFavo")//查询某用户是否收藏了某景点
	public String favo(HttpServletRequest request, HttpServletResponse response, String username, Integer routeid){
		//System.out.println("username:" + username + " " + "spotid:" + spotid);
		UserinfoExample userinfoExample = new UserinfoExample();
		userinfoExample.createCriteria().andNameEqualTo(username);
		List<Userinfo> list = userinfoService.selectByExample(userinfoExample);
		if(list != null && list.size() > 0){  	//有这个用户才能进行以下操作
			System.out.println("userId:" + list.get(0).getId());
			Integer userId = list.get(0).getId();
			List<RouteFavorite> listFavorites = null;
			int result = 0;
			try {				
				RouteFavorite record = new RouteFavorite();
				record.setUserId(userId); 
				record.setRouteId(routeid);
				result = RouteFavoriteService.insert(record);
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
				if (result > 0) {
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
	


	@RequestMapping("/routeNoFavo")//查询某用户是否收藏了某景点
	public String noFavo(HttpServletRequest request, HttpServletResponse response, String username, Integer routeid){
		//System.out.println("username:" + username + " " + "spotid:" + spotid);
		UserinfoExample userinfoExample = new UserinfoExample();
		userinfoExample.createCriteria().andNameEqualTo(username);
		List<Userinfo> list = userinfoService.selectByExample(userinfoExample);
		if(list != null && list.size() > 0){  	//有这个用户才能进行以下操作
			System.out.println("userId:" + list.get(0).getId());
			Integer userId = list.get(0).getId();
			List<RouteFavorite> listFavorites = null;
			
			try {
				RouteFavoriteExample example = new RouteFavoriteExample();
				example.createCriteria().andUserIdEqualTo(userId).andRouteIdEqualTo(routeid);
				listFavorites = RouteFavoriteService.selectByExample(example);
				
				
			} catch (Exception e) {
				list = null;
				e.printStackTrace();
			}
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");

			
			int result = 0;
			PrintWriter printWriter;
			try {
				if (listFavorites != null && listFavorites.size() > 0) {
					Integer sid = listFavorites.get(0).getId();
					result = RouteFavoriteService.deleteByPrimaryKey(sid);				
					
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				printWriter = response.getWriter();
				if(result > 0){
					printWriter.print("yes");
					System.out.println("yes");
				} else {
					printWriter.print("no");
					System.out.println("no");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	

}
