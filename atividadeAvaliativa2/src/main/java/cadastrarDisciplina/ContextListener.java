package cadastrarDisciplina;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContext;


@WebListener
public class ContextListener implements ServletContextListener {
	
	public static final String PROGWEB = "listaDisciplinas";


	@Override
	public void contextInitialized(ServletContextEvent ev) {
		ServletContext context = ev.getServletContext();
		context.setAttribute(PROGWEB, new listaDisciplinas());
		
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent ev) {
		// TODO Auto-generated method stub
	
		ServletContext context = ev.getServletContext();
		context.removeAttribute(PROGWEB);
		
		
	}
	
}
