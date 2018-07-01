package com.cn.techblogs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.cn.techblogs.pojo.User;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

@Controller
@RequestMapping("/index")
@ResponseBody
public class IndexSearchController {
	@RequestMapping("/search")
	public String DoSearch(HttpServletRequest request,Model model){
		JSONArray array =new JSONArray();

        for(int i = 0; i < 10; i++){
            JSONObject obj=new JSONObject();
            //前台通过key值获得对应的value值
            obj.put("Title", "Book " + i);
            obj.put("Name", "Amaze");
            array.add(obj);
        }
       return array.toString();
	}
}
