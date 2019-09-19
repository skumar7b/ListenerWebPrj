


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
public class ListenerEx implements ServletContextListener {
   
    public ListenerEx() {
    }
    private ServletContext context;
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Servlet Context Initialized");
        context =servletContextEvent.getServletContext();
        String attributeValue = "Servlet Context Param Value";
        String attributeName ="ContextParam";
        context.setAttribute(attributeName, attributeValue);
    }
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Servlet Context Destroyed successfully");
    }
}