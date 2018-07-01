package com.cn.techblogs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.techblogs.pojo.User;

@Controller
@RequestMapping("/index")
public class IndexSearchController {
	@RequestMapping("/search")
	public String Search(HttpServletRequest request,Model model){
		return "Just a try";
	}
}
