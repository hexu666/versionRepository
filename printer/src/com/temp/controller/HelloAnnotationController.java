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
 *  HelloAnnotationController��һ������ע��Ŀ�����,
 *  ����ͬʱ����������������������ʵ���κνӿڡ�
 *  org.springframework.stereotype.Controllerע������ָʾ������һ��������
 */
@Controller
@RequestMapping(value="/annotationhello")
public class HelloAnnotationController{

	private static final Log logger = LogFactory
			.getLog(HelloController.class);
	
	@Autowired
	private HelloService helloService;

	/**
	 * org.springframework.web.bind.annotation.RequestMappingע��
	 * ����ӳ������ĵ�URL������ķ����ȡ���������ӳ��"/hello"
	 * helloֻ��һ����ͨ������
	 * �÷�������һ��������ͼ·������ͼ·����ģ�͵�ModelAndView����
	 * */
	@RequestMapping(value="/annotationhello1")
	public ModelAndView annotationhello(){
		logger.info("hello1���� ������");
		// ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
		ModelAndView mv = new ModelAndView();
		// ���ģ������ �����������POJO����  
		mv.addObject("message", JSON.parse(helloService.getJosnString()));  
		// �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
		mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// ����ModelAndView����
		return mv;
	}
	
	/**
	 * ������󷽷�����Ҫ����HttpSession���󣬿����HttpSession��Ϊ������
	 * Spring�Ὣ����׼ȷ�ش��ݸ�����
	 * @param httpSession
	 * @return
	 */
	@RequestMapping(value="/annotationhello2")
	public ModelAndView annotationhello2(HttpSession httpSession){
		logger.info("hello2���� ������");
		// ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
		ModelAndView mv = new ModelAndView();
		// ���ģ������ �����������POJO����  
		mv.addObject("message", JSON.parse(helloService.getJosnString()));  
		// �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
		mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// ����ModelAndView����
		return mv;
	}
	
	
	/**
	 * ������󷽷�����Ҫ���ʿͻ������Ի�����HttpServletRequest���󣬷���ǩ��������������
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value="/annotationhello3")
	public ModelAndView annotationhello3(HttpServletRequest httpServletRequest,Locale locale){
		logger.info("hello3���� ������");
		// ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
		ModelAndView mv = new ModelAndView();
		// ���ģ������ �����������POJO����  
		mv.addObject("message", JSON.parse(helloService.getJosnString()));  
		// �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
		mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// ����ModelAndView����
		return mv;
	}

}