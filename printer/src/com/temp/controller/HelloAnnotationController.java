package com.temp.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.temp.service.HelloService;


/**
 *  HelloAnnotationController是一个基于注解的控制器,
 *  可以同时处理多个请求动作，并且无须实现任何接口。
 *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
@RequestMapping(value="/annotationhello")
public class HelloAnnotationController{

	private static final Log logger = LogFactory
			.getLog(HelloController.class);
	
	@Autowired
	private HelloService helloService;

	/**
	 * org.springframework.web.bind.annotation.RequestMapping注解
	 * 用来映射请求的的URL和请求的方法等。本例用来映射"/hello"
	 * hello只是一个普通方法。
	 * 该方法返回一个包含视图路径或视图路径和模型的ModelAndView对象。
	 * */
	@RequestMapping(value="/annotationhello1")
	public ModelAndView annotationhello(){
		logger.info("hello1方法 被调用");
		// 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象  
		mv.addObject("message", JSON.parse(helloService.getJosnString()));  
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
		mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// 返回ModelAndView对象。
		return mv;
	}
	
	/**
	 * 如果请求方法中需要访问HttpSession对象，可添加HttpSession作为参数，
	 * Spring会将对象准确地传递给方法
	 * @param httpSession
	 * @return
	 */
	@RequestMapping(value="/annotationhello2")
	public ModelAndView annotationhello2(HttpSession httpSession){
		logger.info("hello2方法 被调用");
		// 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象  
		mv.addObject("message", JSON.parse(helloService.getJosnString()));  
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
		mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// 返回ModelAndView对象。
		return mv;
	}
	
	
	/**
	 * 如果请求方法中需要访问客户端语言环境和HttpServletRequest对象，方法签名可以如下配置
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value="/annotationhello3")
	public ModelAndView annotationhello3(HttpServletRequest httpServletRequest,Locale locale){
		logger.info("hello3方法 被调用");
		// 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象  
		mv.addObject("message", JSON.parse(helloService.getJosnString()));  
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
		mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// 返回ModelAndView对象。
		return mv;
	}

}