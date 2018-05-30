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
        System.out.println("����init()����...");
    }
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("����doGet()����...");
        //PrintTool.printStart();
        resp.getWriter().print("HELLO");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("����doPost()����...");
    }
    
    public void destroy() {
        System.out.println("����destroy()����...");
    }
}
