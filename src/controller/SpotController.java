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
import service.AdmininfoService;
import service.SpotService;
import service.UserinfoService;

@Controller
public class SpotController {

	@Autowired
	private SpotService spotService;

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
		System.out.println("������" + spots.size());
		if (spots.size() == 0)
			System.out.println("���У���ֵ��");//����ˣ�Ϊʲô��䲻ִ��
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
			request.getSession().setAttribute("addMsg", "��ӳɹ���");
		} else {
			request.getSession().setAttribute("addMsg", "���ʧ�ܣ�");
		}
		return "WEB-INF/spot_management";
	}

	@RequestMapping("/delSpot")
	public String delSpot(HttpServletRequest request, Integer id) {
		System.out.println(id);
		if (spotService.delSpot(id) > 0) {
			request.getSession().setAttribute("delMsg", "ɾ���ɹ���");
		} else {
			request.getSession().setAttribute("delMsg", "ɾ��ʧ�ܣ�");
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

		}*/
		System.out.println("intro" + intro);
		if (spotService.updateSpot(id, name, pic, trans, intro) > 0) {
			request.getSession().setAttribute("updateMsg", "���³ɹ���");
		} else {
			request.getSession().setAttribute("updateMsg", "����ʧ�ܣ�");
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
}
