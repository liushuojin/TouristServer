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
import entity.RouteRating;
import entity.RouteRatingExample;
import entity.Userinfo;
import entity.UserinfoExample;
import service.AdmininfoService;
import service.SpotFavoriteService;
import service.RouteRatingService;
import service.SpotService;
import service.UserinfoService;

@Controller
public class RouteRatingController {

	@Autowired
	private RouteRatingService RouteRatingService;	

	@Autowired
	private UserinfoService userinfoService;	

	@Autowired
	private SpotService spotService;	

	@RequestMapping("/addRouteRating")//查询某用户是否收藏了某景点
	public String favo(HttpServletRequest request, HttpServletResponse response, 
			String username, Integer routeid, Float score, String comment){
		//System.out.println("username:" + username + " " + "spotid:" + spotid);
		UserinfoExample userinfoExample = new UserinfoExample();
		userinfoExample.createCriteria().andNameEqualTo(username);
		List<Userinfo> list = userinfoService.selectByExample(userinfoExample);
		if(list != null && list.size() > 0){  	//有这个用户才能进行以下操作
			System.out.println("userId:" + list.get(0).getId());
			Integer userId = list.get(0).getId();
			List<SpotFavorite> listFavorites = null;
			int result = 0;
			try {

				if(list.get(0).getStatus() == 1){
					RouteRating record = new RouteRating();
					record.setUserId(userId); 
					record.setRouteId(routeid);
					record.setScore(score);
					record.setComment(comment);
					result = RouteRatingService.insert(record);
				}
				//System.out.println(list.size());
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
	

	@RequestMapping("/getRouteRating")//查询某用户是否收藏了某景点
	public String getRouteRating(HttpServletRequest request, HttpServletResponse response,  Integer routeid){
		//System.out.println("username:" + username + " " + "spotid:" + spotid);
		RouteRatingExample example = new RouteRatingExample();
		example.createCriteria().andRouteIdEqualTo(routeid);
		List<RouteRating> list = null;
		try {
			list = RouteRatingService.selectByExampleWithBLOBs(example);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
	

	//@RequestMapping("/spotNoFavo")//查询某用户是否收藏了某景点
	/*public String noFavo(HttpServletRequest request, HttpServletResponse response, String username, Integer spotid){
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
					result = spotFavoriteService.deleteByPrimaryKey(sid);
					
					
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
	
	*/

}
