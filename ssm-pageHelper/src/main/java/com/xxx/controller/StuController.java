package com.xxx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.xxx.jopo.Stu;
import com.xxx.service.StuService;
import com.xxx.util.PublicDate;

@Controller
public class StuController {
	@Autowired
	private StuService stuService;
 
	@RequestMapping("/getAllStuByPage2.do")
	@ResponseBody
	public String getAllStuByPage2(int pageNum) {
		List<Stu> list = this.stuService.getAllStuByPage(pageNum, PublicDate.PAGE_SIZE);
		PageInfo<Stu> info = new PageInfo<>(list);
		int totalPageNum = info.getPages();
		
		String stujson = "";
		Stu stu=null;
		for (int i=0;i<list.size(); i++) {
			stu = list.get(i);
			stujson += stu.toJson();
			if(i<list.size()-1) {
				stujson +=",";
			}
		}
		String inf = "{\"pageNum\":"+pageNum+",\"totalPageNum\":"+totalPageNum+",\"list\":["+stujson+"]}";
		return  inf;
	}
}
















