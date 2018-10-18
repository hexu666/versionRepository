package org.sz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *  HelloController��һ��ʵ��Controller�ӿڵĿ�����,
 *  ���Դ���һ����һ��������
 */
public class HelloController implements Controller{
     private static final Log logger = LogFactory.getLog(HelloController.class);

     /**
      * ��Spring2.5֮ǰ������һ��Handle��Ψһ��������ʵ��
      * org.springframework.web.servlet.mvc.Controller�ӿڡ�
      * 
      * handleRequest��Controller�ӿڱ���ʵ�ֵķ�����
      * �÷����Ĳ����Ƕ�Ӧ�����HttpServletRequest��HttpServletResponse��
      * �÷������뷵��һ��������ͼ·������ͼ·����ģ�͵�ModelAndView����
      * */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
         logger.info("handleRequest ������");
         // ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
         ModelAndView mv = new ModelAndView();
         // ����ģ������ �����������POJO����  
         mv.addObject("message", "Hello World!");  
         // �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
         //mv.setViewName("/WEB-INF/content/welcome.jsp"); 
         // ����ModelAndView����
         return mv;
    }

}