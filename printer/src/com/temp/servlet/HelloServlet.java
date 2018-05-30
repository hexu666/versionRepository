package com.temp.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
    /**
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
        System.out.println("这是init()方法...");
    }
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("这是doGet()方法...");
        //PrintTool.printStart();
        resp.getWriter().print("HELLO");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是doPost()方法...");
    }
    
    public void destroy() {
        System.out.println("这是destroy()方法...");
    }
}
