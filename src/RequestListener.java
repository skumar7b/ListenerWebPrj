 
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
 
public class RequestListener implements ServletRequestListener {
 
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("Working with servlet request "
				+ event.getServletRequest().getRemoteAddr());
	}
 
	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("Initialize request"
				+ event.getServletRequest().getRemoteAddr());
 
	}
 
}