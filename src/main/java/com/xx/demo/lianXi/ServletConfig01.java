package com.xx.demo.lianXi;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ssss
 * @date 2022/5/5 17:19
 */
public class ServletConfig01 implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servlet被调用了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("关闭servlet");
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ServletConfig01 servletConfig01 = ServletConfig01.class.newInstance();
        System.out.println("servletConfig01 = " + servletConfig01);
    }

}
