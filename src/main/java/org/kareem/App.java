package org.kareem;

import jakarta.servlet.Servlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(2025);
        tomcat.getConnector();

        Context context = tomcat.addContext("", null);

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        try {
            tomcat.start();
            System.out.println("Server started on http://localhost:2025/"); // add ?name=Kareem
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
    }
}
